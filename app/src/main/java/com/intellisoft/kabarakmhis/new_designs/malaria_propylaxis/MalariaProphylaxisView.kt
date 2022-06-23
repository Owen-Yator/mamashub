package com.intellisoft.kabarakmhis.new_designs.malaria_propylaxis

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.intellisoft.kabarakmhis.R
import com.intellisoft.kabarakmhis.helperclass.FormatterClass
import com.intellisoft.kabarakmhis.network_request.requests.RetrofitCallsFhir
import com.intellisoft.kabarakmhis.new_designs.adapter.ObservationAdapter

import com.intellisoft.kabarakmhis.new_designs.roomdb.KabarakViewModel
import com.intellisoft.kabarakmhis.new_designs.screens.PatientProfile

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MalariaProphylaxisView : AppCompatActivity() {

    private val retrofitCallsFhir = RetrofitCallsFhir()
    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var kabarakViewModel: KabarakViewModel
    private val formatter = FormatterClass()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_malaria_prophylaxis_view)

        title = "Malaria Prophylaxis Details"



        kabarakViewModel = KabarakViewModel(this.applicationContext as Application)

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



        CoroutineScope(Dispatchers.IO).launch {

            val observationId = formatter.retrieveSharedPreference(this@MalariaProphylaxisView,"observationId")
            if (observationId != null) {
                val observationList = retrofitCallsFhir.getObservationDetails(this@MalariaProphylaxisView, observationId)

                CoroutineScope(Dispatchers.Main).launch {
                    val configurationListingAdapter = ObservationAdapter(
                        observationList,this@MalariaProphylaxisView)
                    recyclerView.adapter = configurationListingAdapter
                }

            }



        }


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