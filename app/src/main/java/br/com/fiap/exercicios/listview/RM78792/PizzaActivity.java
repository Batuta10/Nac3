package br.com.fiap.exercicios.listview.RM78792;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaActivity extends AppCompatActivity {

    ImageView imgPizza;
    TextView saborPizza;
    TextView descricaoPizza;
    TextView igredientePizza;
    TextView alergiaPizza;
    TextView notaPizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        Pizza pizza = (Pizza) getIntent().getExtras().get("pizza");

        actionBar.setTitle(pizza.getSabor());

        imgPizza = (ImageView) findViewById(R.id.imgPizza);
        saborPizza = (TextView) findViewById(R.id.txtSabor);
        descricaoPizza = (TextView) findViewById(R.id.txtDescricao);
        notaPizza = (TextView) findViewById(R.id.txtNota);
        igredientePizza = (TextView) findViewById(R.id.txtIgrediente);
        alergiaPizza = (TextView) findViewById(R.id.txtAlergia);



        imgPizza.setImageResource(pizza.getImg());
        saborPizza.setText(pizza.getSabor());
        descricaoPizza.setText(pizza.getDescricao());
        igredientePizza.setText(pizza.getIngredients());
        alergiaPizza.setText(pizza.getAlergia());
        notaPizza.setText(String.valueOf(pizza.getNota()));

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

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
}//Main Class