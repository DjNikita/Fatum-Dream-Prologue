package com.example.fatumdream.Activity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fatumdream.R;

public class MainActivity extends Activity {
    Intent authors;
    Intent startgame;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
        mp = MediaPlayer.create(this,R.raw.dreamlike);
        mp.setLooping(true);
        mp.start();
        authors = new Intent(MainActivity.this, AuthorActivity.class);
        startgame = new Intent(MainActivity.this, NameActivity.class);
    }

    public void Start(View view) {
        startActivity(startgame);
        mp.stop();
    }

    public void Authors(View view) {
        startActivity(authors);
        mp.stop();
    }

    public void Exit(View view) {
        mp.stop();
        finish();
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

