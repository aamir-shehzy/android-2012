package com.fkysoft;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

public class SecondActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        
        Intent i 	 = getIntent();
        String name  = i.getStringExtra("name");
        String email = i.getStringExtra("email");
        
        TextView lblName = (TextView)findViewById(R.id.lblName);
        TextView lblEmail = (TextView)findViewById(R.id.lblEmail);
        lblName.setText(name);
        lblEmail.setText(email);
        
        Button btnClose = (Button)findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				finish();
			}
		});
    }
}

