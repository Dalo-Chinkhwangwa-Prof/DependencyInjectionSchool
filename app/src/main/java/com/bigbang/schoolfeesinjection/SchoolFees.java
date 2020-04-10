package com.bigbang.schoolfeesinjection;

import android.content.Context;
import android.widget.Toast;

public class SchoolFees {

    private Context context;

    public SchoolFees(Context context) {
        this.context = context;
    }

    public void paySchoolFees(String feesAmount){

       Toast.makeText(context, "The amount requested  : "+feesAmount, Toast.LENGTH_LONG).show();

    }
}
