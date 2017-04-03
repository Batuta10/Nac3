package br.com.fiap.exercicios.listview.RM78792;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sp = getSharedPreferences("PizzariaPreferences", MODE_PRIVATE);

        int splashTime = sp.getInt("splashTime", 3000);
        boolean disable = sp.getBoolean("disableSplash", false);

        if( !disable ) {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    loadMainActivity();
                }
            }, splashTime);
        } else {
            loadMainActivity();
        }
    }

    public void loadMainActivity() {
        Intent it = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(it);

        finish();
    }
}
