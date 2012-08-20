package com.fkysoft;

import android.os.Bundle;
import android.app.Activity;

public class AndroidLayoutActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.linear_layout);
        //setContentView(R.layout.relative_layout);
        setContentView(R.layout.table_layout);
    }
}
