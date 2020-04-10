package com.bigbang.schoolfeesinjection.di;

import com.bigbang.schoolfeesinjection.di.componentGuardian.GuardianComponent;

public class DocumentFolderSingleton {

    private static DocumentFolderSingleton documentFolderSingleton = null;//Documents are empty...

    private GuardianComponent guardianComponent;
    public GuardianComponent getGuardianComponent() {
        return guardianComponent;
    }

    public void setGuardianComponent(GuardianComponent guardianComponent) {
        this.guardianComponent = guardianComponent;
    }

    private DocumentFolderSingleton(){

    }

    public static DocumentFolderSingleton getInstance(){
        if(documentFolderSingleton == null)
            documentFolderSingleton = new DocumentFolderSingleton();
        return documentFolderSingleton;
    }
}
