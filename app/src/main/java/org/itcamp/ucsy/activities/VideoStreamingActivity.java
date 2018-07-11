package org.itcamp.ucsy.activities;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.afollestad.easyvideoplayer.EasyVideoCallback;
import com.afollestad.easyvideoplayer.EasyVideoPlayer;

import org.itcamp.ucsy.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoStreamingActivity extends AppCompatActivity implements EasyVideoCallback {

    @BindView(R.id.easy_player)EasyVideoPlayer mEasyVideoPlayer;

    private static final String TEST_URL = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_streaming);

        ButterKnife.bind(this);

        // Sets the callback to this Activity, since it inherits EasyVideoCallback
        mEasyVideoPlayer.setCallback(this);

        // Sets the source to the HTTP URL held in the TEST_URL variable.
        // To play files, you can use Uri.fromFile(new File("..."))
        mEasyVideoPlayer.setSource(Uri.parse(TEST_URL));
        mEasyVideoPlayer.start();


    }

    @Override
    public void onStarted(EasyVideoPlayer player) {
        Toast.makeText(getApplicationContext(),"start",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPaused(EasyVideoPlayer player) {
        super.onPause();
        // Make sure the player stops playing if the user presses the home button.
       // player.pause();
    }

    @Override
    public void onPreparing(EasyVideoPlayer player) {

    }

    @Override
    public void onPrepared(EasyVideoPlayer player) {

    }

    @Override
    public void onBuffering(int percent) {


    }

    @Override
    public void onError(EasyVideoPlayer player, Exception e) {

    }

    @Override
    public void onCompletion(EasyVideoPlayer player) {

    }

    @Override
    public void onRetry(EasyVideoPlayer player, Uri source) {

    }

    @Override
    public void onSubmit(EasyVideoPlayer player, Uri source) {

    }
}
