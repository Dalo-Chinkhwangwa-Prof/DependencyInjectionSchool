package com.bigbang.schoolfeesinjection.di.moduleBank;

import android.content.Context;

import com.bigbang.schoolfeesinjection.SchoolFees;

import dagger.Module;
import dagger.Provides;


@Module//BankFeeRegistration
public class SchoolFeesModule {

    //Bankers Signature
    private Context signature;

    public SchoolFeesModule(Context context) { //GetBankManagers Signature
        this.signature = context;
    }

    @Provides
    public SchoolFees providesSchoolFees(){
        return new SchoolFees(signature);
    }


}
