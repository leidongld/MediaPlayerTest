package com.example.leidong.mediaplayertest;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.ui.widget.VideoView;

public class MainActivity extends AppCompatActivity implements OnPreparedListener {
    private VideoView videoView;
    private Button button1;
    private static final String MP3_URL = "http://minisite.adsame.com/nodie/v2.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    /**
     *
     */
    private void initView() {
        button1 = (Button) findViewById(R.id.button1);
        videoView = (VideoView) findViewById(R.id.video_view);
        videoView.setOnPreparedListener(this);
        videoView.setVideoURI(Uri.parse(MP3_URL));
    }

    @Override
    public void onPrepared() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
            }
        });
    }
}
