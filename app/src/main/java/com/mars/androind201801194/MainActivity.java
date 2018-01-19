package com.mars.androind201801194;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

//使用程式來替換不同fragment layout
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void click1(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.layout1, new Fragmenta());
        ft.commit();
    }

    public void click2(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.layout1, new Fragmentb());
        ft.commit();
    }
}
