package br.com.fiap.exercicios.listview.RM78792;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;

public class PizzaActivity extends AppCompatActivity {

    ImageView imgPizza;
    TextView saborPizza;
    TextView descricaoPizza;
    TextView igredientePizza;
    TextView alergiaPizza;
    TextView precoPizza;
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