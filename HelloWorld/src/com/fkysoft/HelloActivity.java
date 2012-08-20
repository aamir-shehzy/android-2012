package com.fkysoft;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloActivity extends Activity {
	EditText txtInputName;
	TextView lblName;
	Button btnName;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        
        //code duoi day
        txtInputName = (EditText) findViewById(R.id.name);
        lblName = (TextView) findViewById(R.id.display);
        btnName = (Button) findViewById(R.id.btnName);
        
        btnName.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		        lblName.setText(txtInputName.getText());
			}
		});
        
    }
}
