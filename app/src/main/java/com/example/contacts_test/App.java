package com.example.contacts_test;

import android.app.Application;


public class App extends Application {

    private static AppComponent sAppComponent;


    public static AppComponent getAppComponent() {
        return sAppComponent;
    }


    @Override
    public void onCreate() {
        super.onCreate();

        sAppComponent = buildComponent();
    }


    private AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .contextModule(new ContextModule(getApplicationContext()))
                .rxUtilsModule(new RxUtilsModule())
                .build();
    }
}
