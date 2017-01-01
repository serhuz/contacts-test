package com.example.contacts_test;

import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class ContextModule {

    private Context mContext;


    public ContextModule(Context context) {
        mContext = context;
    }


    @Provides
    @Singleton
    @NonNull
    Context provideContext() {
        return mContext;
    }
}
