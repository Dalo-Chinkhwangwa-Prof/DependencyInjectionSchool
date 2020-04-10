package com.bigbang.schoolfeesinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bigbang.schoolfeesinjection.di.DocumentFolderSingleton;

import javax.inject.Inject;

public class UniversityStudent extends AppCompatActivity {

    private String shcoolFees = "$10,000.10";

    @Inject//get School fees from guardian
    SchoolFees schoolFees;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DocumentFolderSingleton.getInstance().getGuardianComponent().inject(this); //The school fees

        //Pay School Fees
        schoolFees.paySchoolFees(shcoolFees);
    }
}
