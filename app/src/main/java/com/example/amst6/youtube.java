package com.example.amst6;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class youtube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube);

        ////////////////

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse("rtsp://r1---sn-q4fl6nlz.googlevideo.com/Cj0LENy73wIaNAnFtDa-kMslHhMYDSANFC3ghMhdMOCoAUIASARg3PjS_eaBj8tdigELOEltX0V1Qk9hWHMM/966CCB2D4C5D860F2E3D2C6EF5BAB0FC3F7853A4.B0AB056A345EC9C15487F1F7F0B738DD53D7C1D0/yt8/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        /////////////
    }
}

