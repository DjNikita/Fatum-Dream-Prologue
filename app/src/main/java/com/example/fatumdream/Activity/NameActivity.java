package com.example.fatumdream.Activity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import com.example.fatumdream.R;


/**
 * Created by Никита Ирюпин on 14.04.2016.
 */
public class NameActivity extends Activity {
    Button Bn;
    Intent startgame;
    MediaPlayer mp;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_activity);
        //mp = MediaPlayer.create(this,R.raw)
        Bn = (Button) findViewById(R.id.Go);
        startgame = new Intent(NameActivity.this, GameActivity.class);

        Bn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(startgame);
            }


        });
    }
}