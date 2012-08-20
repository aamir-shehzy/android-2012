package com.fkysoft;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;

public class FirstActivity extends Activity {
	EditText txtName;
	EditText txtEmail;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);
        
        txtName = (EditText)findViewById(R.id.txtName);
        txtEmail = (EditText)findViewById(R.id.txtEmail);
        Button btnSend = (Button)findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
		        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
		        i.putExtra("name", txtName.getText().toString());
		        i.putExtra("email", txtEmail.getText().toString());		        
		        startActivity(i);
			}
		});
        
    }
}