package br.com.fiap.exercicios.listview.RM78792;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstPizza;
    List<Pizza> lpizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lpizza = GeraPizza.pizzaList();
        PizzaAdapter pizzaAdapter= new PizzaAdapter(this, lpizza);
        lstPizza = (ListView) findViewById(R.id.lstPizza);
        lstPizza.setAdapter(pizzaAdapter);
        lstPizza.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Pizza pizza = lpizza.get(i);

                Intent it = new Intent(MainActivity.this, PizzaActivity.class);
                it.putExtra("pizza", pizza);
                startActivity(it);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.preferencesMn:
                Intent it = new Intent(MainActivity.this, PreferencesActivity.class);
                startActivity(it);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
