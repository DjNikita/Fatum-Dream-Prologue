package com.example.fatumdream.Activity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fatumdream.R;

/**
 * Created by Никита Ирюпин on 14.04.2016.
 */
public class AuthorActivity extends Activity {
    Button ba;
    Intent intent;
    MediaPlayer mp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.author_activity);
        mp = MediaPlayer.create(this,R.raw.mellowtron);
        mp.setLooping(true);
        mp.start();

        ba = (Button) findViewById(R.id.ba1);
        intent = new Intent(AuthorActivity.this, MainActivity.class);

        ba.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }


        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mp.start();
    }
}
