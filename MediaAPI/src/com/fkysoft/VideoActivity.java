package com.fkysoft;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.VideoView;
import android.app.Activity;

public class VideoActivity extends Activity {
	VideoView videoView;
	MediaPlayer mediaPlayer;
	static final String VIDEO_PATH = Environment.getExternalStorageDirectory().getPath()+"/sample.mp4";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        
        videoView = (VideoView)this.findViewById(R.id.videoView);
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoPath(VIDEO_PATH);
        videoView.requestFocus();
        
        videoView.start();
    }
}
