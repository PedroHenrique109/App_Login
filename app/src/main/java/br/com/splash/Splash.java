package br.com.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    private final Timer timer = new Timer();
    TimerTask timerTask;
    private Object Intent;
    private android.content.Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        timerTask = new TimerTask() {
            @Override
            public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    gotoMainActivity();
                }
            });
            }
        };
    }

    private void gotoMainActivity() {
        Intent = intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.setFlags(Intent.)
    }
}