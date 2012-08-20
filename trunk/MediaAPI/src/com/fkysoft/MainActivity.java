package com.fkysoft;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnAudio = (Button)findViewById(R.id.btnAudio);
        Button btnVideo = (Button)findViewById(R.id.btnVideo);
        Button btnRecording = (Button)findViewById(R.id.btnRecording);
        
        btnAudio.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intentAudio = new Intent(getApplicationContext(), AudioActivity.class);
				startActivity(intentAudio);
			}
		});
        
        btnVideo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intentVideo = new Intent(getApplicationContext(), VideoActivity.class);
				startActivity(intentVideo);
			}
		});
        
        btnRecording.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intentRecording = new Intent(getApplicationContext(), RecordingActivity.class);
				startActivity(intentRecording);
			}
		});
    }
}
