package com.bigbang.schoolfeesinjection;

import android.app.Application;

import com.bigbang.schoolfeesinjection.di.DocumentFolderSingleton;
import com.bigbang.schoolfeesinjection.di.componentGuardian.DaggerGuardianComponent;
import com.bigbang.schoolfeesinjection.di.componentGuardian.GuardianComponent;
import com.bigbang.schoolfeesinjection.di.moduleBank.SchoolFeesModule;

public class SchoolServiceCenter extends Application {

    private GuardianComponent guardianComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        guardianComponent = DaggerGuardianComponent
                .builder()
                .schoolFeesModule(new SchoolFeesModule(this))
                .build();

        DocumentFolderSingleton.getInstance().setGuardianComponent(guardianComponent);
    }
}
