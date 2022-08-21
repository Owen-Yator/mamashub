package com.intellisoft.kabarakmhis.helperclass


enum class DbObservationValues{

    ANC_PNC_CODE,
    KMHFL_CODE,
    EDUCATION_LEVEL,
    CLIENT_NAME,
    DATE_OF_BIRTH,
    MARITAL_STATUS,

    COUNTY_NAME,
    SUB_COUNTY_NAME,
    WARD_NAME,
    TOWN_NAME,
    ADDRESS_NAME,
    ESTATE_NAME,
    PHONE_NUMBER,


    GRAVIDA,
    PARITY,
    HEIGHT,
    WEIGHT,
    LMP,
    EDD,
    RELATIONSHIP,
    GESTATION,

    /**
     * Medical and Surgical History
     */
    //Surgical History
    SURGICAL_HISTORY,
    OTHER_GYNAECOLOGICAL_HISTORY,
    OTHER_SURGICAL_HISTORY,

    //Medical History
    DIABETES,
    HYPERTENSION,
    OTHER_CONDITIONS,
    OTHER_CONDITIONS_SPECIFY,
    BLOOD_TRANSFUSION,
    BLOOD_TRANSFUSION_REACTION,
    TUBERCULOSIS,

    //Drug Allergies
    DRUG_ALLERGY,
    SPECIFIC_DRUG_ALLERGY,
    NON_DRUG_ALLERGY,
    SPECIFIC_NON_DRUG_ALLERGY,

    //Family History
    TWINS,
    TWINS_SPECIFY,
    TB_FAMILIY_HISTORY,
    TB_FAMILIY_NAME,
    TB_FAMILIY_RELATIONSHIP,
    FAMILY_LIVING_HOUSEHOLD,
    FAMILIY_TB_SCREENING,


    /**
     * Physical Examination
     */
    GENERAL_EXAMINATION,
    ABNORMAL_GENERAL_EXAMINATION,
    SYSTOLIC_BP,
    DIASTOLIC_BP,
    PULSE_RATE,
    TEMPARATURE,
    CVS,
    ABNORMAL_CVS,
    RESPIRATORY_MONITORING,
    ABNORMAL_RESPIRATORY_MONITORING,
    BREAST_EXAM,
    ABNORMAL_BREAST_EXAM,
    NORMAL_BREAST_EXAM,

    ABDOMINAL_INSPECTION,
    SPECIFY_ABDOMINAL_INSPECTION,

    ABDOMINAL_PALPATION,
    SPECIFY_ABDOMINAL_PALPATION,

    ABDOMINAL_AUSCALATION,
    SPECIFY_ABDOMINAL_AUSCALATION,

    EXTERNAL_INSPECTION,
    SPECIFY_EXTERNAL_INSPECTION,
    EXTERNAL_PALPATION,
    SPECIFY_EXTERNAL_PALPATION,
    EXTERNAL_DISCHARGE,
    SPECIFY_EXTERNAL_DISCHARGE,
    EXTERNAL_GENITAL_ULCER,
    SPECIFY_EXTERNAL_GENITAL_ULCER,

    EXTERNAL_FGM,
    COMPLICATIONS_EXTERNAL_FGM,

    PREGNANCY_ORDER,
    YEAR,
    ANC_NO,
    CHILDBIRTH_PLACE,
    LABOUR_DURATION,
    DELIVERY_MODE,

    BABY_WEIGHT,
    BABY_SEX,
    BABY_OUTCOME,
    BABY_PURPERIUM,
    ABNORMAL_BABY_PURPERIUM,

    HB_TEST,
    SPECIFIC_HB_TEST,
    BLOOD_GROUP_TEST,
    SPECIFIC_BLOOD_GROUP_TEST,
    RHESUS_TEST,
    SPECIFIC_RHESUS_TEST,
    BLOOD_RBS_TEST,
    SPECIFIC_BLOOD_RBS_TEST,

    URINALYSIS_TEST,
    URINALYSIS_RESULTS,
    ABNORMAL_URINALYSIS_TEST,
    URINALYSIS_TEST_DATE,

    TB_SCREENING,
    TB_SCREENING_RESULTS,
    POSITIVE_TB_DIAGNOSIS,
    NEGATIVE_TB_DIAGNOSIS,
    IPT_DATE,
    IPT_VISIT,

    MULTIPLE_BABIES,
    NO_MULTIPLE_BABIES,

    OBSTERIC_ULTRASOUND_1,
    OBSTERIC_ULTRASOUND_1_DATE,
    OBSTERIC_ULTRASOUND_2,
    OBSTERIC_ULTRASOUND_2_DATE,

    HIV_STATUS_BEFORE_1_ANC,
    ART_ELIGIBILITY,
    PARTNER_HIV,

    ARV_ANC,
    HAART_ANC,
    COTRIMOXAZOLE,

    HIV_TESTING,
    YES_HIV_RESULTS,
    NO_HIV_RESULTS,
    HIV_MOTHER_STATUS,
    HIV_NR_DATE,

    SYPHILIS_TESTING,
    YES_SYPHILIS_RESULTS,
    NO_SYPHILIS_RESULTS,
    SYPHILIS_MOTHER_STATUS,

    HEPATITIS_TESTING,
    YES_HEPATITIS_RESULTS,
    NO_HEPATITIS_RESULTS,
    HEPATITIS_MOTHER_STATUS,

    COUPLE_HIV_TESTING,
    PARTNER_HIV_STATUS,
    REACTIVE_PARTNER_HIV_RESULTS,
    REFERRAL_PARTNER_HIV_DATE,

    FACILITY_NAME,
    FACILITY_NUMBER,

    ATTENDANT_NAME,
    ATTENDANT_NUMBER,
    ATTENDANT_DESIGNATION,

    COMPANION_NAME,
    COMPANION_NUMBER,
    COMPANION_RELATIONSHIP,
    COMPANION_TRANSPORT,

    DONOR_NAME,
    DONOR_NUMBER,
    DONOR_BLOOD_GROUP,

    FINANCIAL_PLAN,

    CLINICAL_NOTES_DATE,
    CLINICAL_NOTES,
    CLINICAL_NOTES_NEXT_VISIT,

    CONTACT_NUMBER,
    MUAC,

    PALLOR,
    FUNDAL_HEIGHT,

    PRESENTATION,
    LIE,
    FOETAL_HEART_RATE,
    FOETAL_MOVEMENT,
    NEXT_VISIT_DATE,

    TT_PROVIDED,
    TT_RESULTS,

    TIMING_CONTACT,
    DOSE,
    IPTP_SP,
    IPTP_RESULT,
    LLITN_GIVEN,
    LLITN_GIVEN_NEXT_DATE,
    LLITN_RESULTS,

    REPEAT_SEROLOGY,
    REPEAT_SEROLOGY_RESULTS,
    REPEAT_SEROLOGY_DETAILS,
    REACTIVE_MATERNAL_SEROLOGY,
    PARTNER_REACTIVE_SEROLOGY,
    NON_REACTIVE_SEROLOGY,

    DEWORMING,

    IRON_SUPPLIMENTS,
    DRUG_GIVEN,
    REASON_FOR_NOT_PROVIDING_IRON_SUPPLIMENTS,
    OTHER_SUPPLIMENTS,
    ANC_CONTACT,
    CONTACT_TIMING,
    TABLET_NUMBER,

    DOSAGE_AMOUNT,
    DOSAGE_FREQUENCY,
    DOSAGE_DATE_GIVEN,
    IRON_AND_FOLIC_COUNSELLING,

    IPTP_DATE,

    INTERVENTION_GIVEN,
    DATE_STARTED,
    REGIMEN,
    ART_DOSAGE,
    ART_FREQUENCY,
    REGIMENT_CHANGE,
    VIRAL_LOAD_CHANGE,
    VIRAL_LOAD_RESULTS,

    DANGER_SIGNS,
    DENTAL_HEALTH,
    BIRTH_PLAN,
    RH_NEGATIVE,

    EAT_ONE_MEAL,
    EAT_MORE_MEALS,
    DRINK_WATER,
    TAKE_IFAS,
    AVOID_HEAVY_WORK,
    SLEEP_UNDER_LLIN,
    GO_FOR_ANC,
    NON_STRENUOUS_ACTIVITY,

    INFANT_FEEDING,
    EXCLUSIVE_BREASTFEEDING,

    MOTHER_PALE,
    SEVERE_HEADACHE,
    VAGINAL_BLEEDING,
    ABDOMINAL_PAIN,
    REDUCED_MOVEMENT,

    MOTHER_FITS,
    WATER_BREAKING,
    SWOLLEN_FACE,
    FEVER







}

enum class DbSummaryTitle{

    //Patient Details
    A_FACILITY_DETAILS,
    B_PATIENT_DETAILS,
    C_CLINICAL_INFORMATION,
    D_RESIDENTIAL_INFORMATION,
    E_CONTACT_INFORMATION,
    F_NEXT_OF_KIN,

    //Medical and Surgical History
    A_SURGICAL_HISTORY,
    B_MEDICAL_HISTORY,
    C_DRUG_ALLERGIES,
    D_FAMILY_HISTORY,

    //Preview Physical Exam
    A_PHYSICAL_EXAMINATION,
    B_PHYSICAL_BLOOD_PRESSURE,
    C_WEIGHT_MONITORING,
    D_ABDOMINAL_EXAMINATION,
    E_EXTERNAL_GENITALIA_EXAM,

    //Previous Pregnancy
    A_PREGNANCY_DETAILS,
    B_BABY_DETAILS,

    //Antenatal Profile
    A_BLOOD_TESTS,
    B_URINE_TESTS,
    C_TB_SCREEN,
    D_OBSTETRIC_ULTRASOUND,
    D_MULTIPLE_BABIES,
    E_HIV_STATUS,
    F_MATERNAL_HAART,
    G_HIV_TESTING,
    H_SYPHILIS_TESTING,
    I_HEPATITIS_TESTING,
    J_COUPLE_COUNSELLING_TESTING,

    //Birth Plan
    A_BIRTH_PLAN,
    B_BIRTH_ATTENDANT,
    C_ALTERNATIVE_BIRTH_ATTENDANT,
    D_BIRTH_COMPANION,
    E_ALTERNATIVE_BIRTH_COMPANION,
    F_BLOOD_DONOR,
    E_FINANCIAL_PLAN,

    //Clinical Notes
    CLINICAL_NOTES,

    //Present Pregnancy
    A_CURRENT_PREGNANCY,
    B_PRESENT_BLOOD_PRESSURE,
    C_HB_TEST,
    D_PRESENTATION,

    //Tetanus Diphtheria
    TETANUS_DIPHTHERIA,

    //Malaria Prophylaxis
    A_ANC_VISIT,
    B_LLITN_GIVEN,

    //Maternal Serology
    A_MATERNAL_SEROLOGY,
    B_REACTIVE,
    C_NON_REACTIVE,

    //Deworming
    DEWORMING,

    //Iron and Folic Suppliments
    A_SUPPLIMENTS_ISSUING_TO_CLIENT,
    B_FIRST_CONTACT_BEFORE_ANC,
    C_DOSAGE,
    D_ANC_CONTACT,

    //PMTCT
    A_INTERVENTION_GIVEN,
    B_ART_FOR_LIFE,
    C_PMTCT_DOSAGE,
    D_VL_SAMPLE,

    //Counselling
    A_COUNSELLING_DONE,
    B_PREGNANCY_COUNSELLING,
    C_INFANT_COUNSELLING,
    D_PREGNANCY_COUNSELLING_DETAILS,





}
