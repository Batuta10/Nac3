package br.com.fiap.exercicios.listview.RM78792;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private Context cont;
    private List<Pizza> pizzas;


    public PizzaAdapter(Context cont, List<Pizza> pizzas) {
        this.cont = cont;
        this.pizzas = pizzas;
    }

    @Override
    public int getCount() {
        return this.pizzas.size();
    }

    @Override
    public Object getItem(int i) {
        return this.pizzas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(this.cont);

        Pizza pizza = this.pizzas.get(i);

        View v = layoutInflater.inflate(R.layout.listview_pizzas, null);
        ImageView imgPizza = (ImageView) v.findViewById(R.id.imgPizza);
        TextView txtSabor = (TextView) v.findViewById(R.id.txtSabor);
        TextView txtDescricao = (TextView) v.findViewById(R.id.txtDescricao);
        TextView txtPreco = (TextView) v.findViewById(R.id.txtPreco);

        imgPizza.setImageResource(pizza.getImg());
        txtSabor.setText(pizza.getSabor());
        txtDescricao.setText(pizza.getDescricao());
        txtPreco.setText(NumberFormat.getCurrencyInstance().format(pizza.getPreco()));


        return v;
    }
}
