package com.intellisoft.kabarakmhis.new_designs.clinical_notes

import android.content.Intent
import android.graphics.Typeface
import android.icu.lang.UProperty.INT_START
import android.os.Bundle
import android.text.Html
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.fhir.FhirEngine
import com.intellisoft.kabarakmhis.R
import com.intellisoft.kabarakmhis.fhir.FhirApplication
import com.intellisoft.kabarakmhis.fhir.viewmodels.PatientDetailsViewModel
import com.intellisoft.kabarakmhis.helperclass.DbSummaryTitle
import com.intellisoft.kabarakmhis.helperclass.FormatterClass
import com.intellisoft.kabarakmhis.network_request.requests.RetrofitCallsFhir
import com.intellisoft.kabarakmhis.new_designs.data_class.DbObservationFhirData
import com.intellisoft.kabarakmhis.new_designs.data_class.DbResourceViews
import com.intellisoft.kabarakmhis.new_designs.screens.ConfirmParentAdapter
import com.intellisoft.kabarakmhis.new_designs.screens.PatientProfile
import kotlinx.android.synthetic.main.activity_birth_plan_view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.stream.Stream


class ClinicalNotesView : AppCompatActivity() {

    private val formatter = FormatterClass()

    private val retrofitCallsFhir = RetrofitCallsFhir()

    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var patientDetailsViewModel: PatientDetailsViewModel
    private lateinit var patientId: String
    private lateinit var fhirEngine: FhirEngine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clinical_notes_view)

        title = "Clinical Notes Details"

        patientId = formatter.retrieveSharedPreference(this, "patientId").toString()
        fhirEngine = FhirApplication.fhirEngine(this)

        patientDetailsViewModel = ViewModelProvider(this,
            PatientDetailsViewModel.PatientDetailsViewModelFactory(application,fhirEngine, patientId)
        )[PatientDetailsViewModel::class.java]

        recyclerView = findViewById(R.id.recycler_view);
        layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)


    }

    override fun onStart() {
        super.onStart()

        getObservationDetails()
        getUserDetails()
    }

    private fun getUserDetails() {

        val identifier = formatter.retrieveSharedPreference(this, "identifier")
        val patientName = formatter.retrieveSharedPreference(this, "patientName")

        if (identifier != null && patientName != null) {
            tvPatient.text = patientName
            tvAncId.text = identifier
        }

    }
    private fun getObservationDetails() {

        CoroutineScope(Dispatchers.IO).launch {

            val encounterId = formatter.retrieveSharedPreference(this@ClinicalNotesView,
                DbResourceViews.CLINICAL_NOTES.name)

            if (encounterId != null) {
                val text1 = DbObservationFhirData(
                    DbSummaryTitle.A_CLINICAL_NOTES.name,
                    listOf("410671006","371524004","390840006"))

                val text1List = formatter.getObservationList(patientDetailsViewModel, text1, encounterId)

                val observationDataList = merge(text1List)

                CoroutineScope(Dispatchers.Main).launch {
                    if (observationDataList.isNotEmpty()) {
                        no_record.visibility = View.GONE
                        recycler_view.visibility = View.VISIBLE
                    } else {
                        no_record.visibility = View.VISIBLE
                        recycler_view.visibility = View.GONE
                    }

                    val confirmParentAdapter = ConfirmParentAdapter(observationDataList,this@ClinicalNotesView)
                    recyclerView.adapter = confirmParentAdapter
                }



            }

        }


    }
    private fun <T> merge(first: List<T>): List<T> {
        val list: MutableList<T> = ArrayList()
        Stream.of(first).forEach { item: List<T>? -> list.addAll(item!!) }
        return list
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.profile_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.profile -> {

                startActivity(Intent(this, PatientProfile::class.java))
                finish()

                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}