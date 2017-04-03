package br.com.fiap.exercicios.listview.RM78792;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class PreferencesActivity extends AppCompatActivity {

    SharedPreferences sp;
    EditText splashScreenField;
    Switch disableSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        splashScreenField = (EditText) findViewById(R.id.splashScreenField);
        disableSplash = (Switch) findViewById(R.id.disableSplash);
        sp = getSharedPreferences("PizzariaPreferences", MODE_PRIVATE);

        splashScreenField.setText(String.valueOf( sp.getInt("splashTime", 3000) ));
        disableSplash.setChecked( sp.getBoolean("disableSplash", false) );

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.strPreferencias));
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void savePreferences(View view) {
        int time = Integer.valueOf( splashScreenField.getText().toString() );
        boolean disable = disableSplash.isChecked();

        SharedPreferences.Editor e = sp.edit();
        e.putBoolean("disableSplash", disable);
        e.putInt("splashTime", time);
        e.commit();
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
