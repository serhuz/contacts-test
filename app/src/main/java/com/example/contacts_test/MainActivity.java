package com.example.contacts_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        App.getAppComponent().inject(this);

        setSupportActionBar(toolbar);
    }


    @OnClick(R.id.fab)
    public void startEditActivity() {
        Intent intent = new Intent(this, EditActivity.class);
        startActivity(intent);
    }
}
