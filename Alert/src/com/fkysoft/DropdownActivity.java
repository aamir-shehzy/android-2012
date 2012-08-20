package com.fkysoft;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Spinner;
import android.widget.Toast;

public class DropdownActivity extends Activity implements OnItemSelectedListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dropdown_layout);
        
        Spinner dropDown = (Spinner)findViewById(R.id.lstcategories);
        dropDown.setOnItemSelectedListener(this);
        
        List<String> data = new ArrayList<String>();
        data.add("AA");
        data.add("AB");
        data.add("AC");
        data.add("AD");
        data.add("AE");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,data);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        dropDown.setAdapter(dataAdapter);
    }

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		//String item = parent.getItemAtPosition(position).toString();
		 
        //Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
}
