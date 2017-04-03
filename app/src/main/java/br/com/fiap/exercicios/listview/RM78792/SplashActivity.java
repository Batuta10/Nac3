package br.com.fiap.exercicios.listview.RM78792;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

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
        //Condição para escolher o geito que ele vai esconder a barra de baixo
        if(Build.VERSION.SDK_INT < 19){
            View v = this.getWindow().getDecorView();
            v.setSystemUiVisibility(View.GONE);
        } else {
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY ;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }//OnCreate

    public void loadMainActivity() {
        Intent it = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(it);

        finish();
    }
}
