package com.fkysoft;

import java.io.IOException;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.app.Activity;

public class AudioActivity extends Activity {
	static final String AUDIO_PATH = Environment.getExternalStorageDirectory().getPath()+"/sample.mp3";
	private MediaPlayer mediaPlayer;
	private int playPosition = 0;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio);
        
        Button btnPlay = (Button)findViewById(R.id.btnPlay);
        Button btnRestart = (Button)findViewById(R.id.btnRestart);
        Button btnPause = (Button)findViewById(R.id.btnPause);
        
        btnPlay.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				playAudio(AUDIO_PATH);
			}
		});
        
        btnRestart.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				if(mediaPlayer!=null && mediaPlayer.isPlaying()){
					mediaPlayer.start();
					mediaPlayer.seekTo(playPosition);
				}
			}
		});
        
        btnPause.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				if(mediaPlayer!=null){
					playPosition = mediaPlayer.getCurrentPosition();
					mediaPlayer.pause();
				}
			}
		});
    }
    
    private void playAudio(String audioPath){
    	try {
    		if(mediaPlayer!=null)
    			mediaPlayer.release();
        	mediaPlayer = new MediaPlayer();
			mediaPlayer.setDataSource(audioPath);
			mediaPlayer.prepare();
	    	mediaPlayer.start();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
