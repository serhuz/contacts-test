package com.example.contacts_test;

import javax.inject.Singleton;

import dagger.Component;


@Component(modules = {ContextModule.class, RxUtilsModule.class})
@Singleton
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
