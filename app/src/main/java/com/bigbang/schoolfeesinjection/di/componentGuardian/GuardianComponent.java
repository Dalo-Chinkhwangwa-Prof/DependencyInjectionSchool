package com.bigbang.schoolfeesinjection.di.componentGuardian;


import com.bigbang.schoolfeesinjection.UniversityStudent;
import com.bigbang.schoolfeesinjection.di.moduleBank.SchoolFeesModule;

import dagger.Component;
//Iam guardian
@Component(modules = {SchoolFeesModule.class})//Guardians proof of finance
public interface GuardianComponent {
    void inject(UniversityStudent universityStudent);
}
