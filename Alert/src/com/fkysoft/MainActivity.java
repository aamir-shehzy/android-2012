package com.fkysoft;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button one = (Button)findViewById(R.id.btnOne);
        Button two = (Button)findViewById(R.id.btnTwo);
        Button three = (Button)findViewById(R.id.btnThree);
        
        one.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				AlertDialog alert = new AlertDialog.Builder(MainActivity.this).create();
		        alert.setTitle("Title");
		        alert.setMessage("Message in alert");
		        alert.setIcon(R.drawable.tick);
		        alert.setButton("OK", new OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(), "Your click OK", Toast.LENGTH_SHORT).show();
					}
				});
		        alert.show();
			}
		});
        
        two.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				AlertDialog alert = new AlertDialog.Builder(MainActivity.this).create();
		        alert.setTitle("Title");
		        alert.setMessage("Message in alert");
		        alert.setIcon(R.drawable.tick);
		        alert.setButton("YES", new OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(), "Your click YES", Toast.LENGTH_SHORT).show();
					}
				});
		        alert.setButton2("NO", new OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(), "Your click NO", Toast.LENGTH_SHORT).show();
					}
				});
		        alert.show();
			}
		});
        
        three.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				AlertDialog alert = new AlertDialog.Builder(MainActivity.this).create();
		        alert.setTitle("Title");
		        alert.setMessage("Message in alert");
		        alert.setIcon(R.drawable.tick);
		        
		        alert.setButton("YES", new OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(), "Your click YES", Toast.LENGTH_SHORT).show();
					}
				});
		        alert.setButton2("NO", new OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(), "Your click NO", Toast.LENGTH_SHORT).show();
					}
				});
		        alert.setButton3("Cancel", new OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(), "Your click Cancel", Toast.LENGTH_SHORT).show();
					}
				});
		        alert.show();
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
