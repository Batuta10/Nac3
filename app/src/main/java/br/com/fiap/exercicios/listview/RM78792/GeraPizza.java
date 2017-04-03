package br.com.fiap.exercicios.listview.RM78792;

import java.util.ArrayList;
import java.util.List;

public class GeraPizza {
    public static List<Pizza> pizzaList() {
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new Pizza("Calabresa", "Queijo, Calabresa fatiada e molho de tomate", "Uma das pizza mais pedidas", "Lactoze,corante,carne de porco", R.drawable.calabresa, 35.00, 10.00));
        pizzas.add(new Pizza("Bacon", "Queijo, baico fatiada e molho de tomate", "Para aqueles Bacon Lovers", "Lactoze,corante,carne de porco", R.drawable.bacon, 40.00, 5.00));
        pizzas.add(new Pizza("Mussarela", "Mussarela e molho de tomate", "Uma das pizza mais tadicionais do mundo", "Lactoze,corante", R.drawable.mussa, 60.00, 5.00));
        pizzas.add(new Pizza("Frango", "Queijo, Calabresa fatiada e molho de tomate", "Frango tunado para os fitnnis", "Lactoze,corante e frango", R.drawable.frango, 38.00, 5.00));
        pizzas.add(new Pizza("Atum", "Queijo, Atum, Cebola e molho de tomate", "Pizza de Peixe fedido", "Lactoze,corante", R.drawable.atum, 70.00, 5.00));
        pizzas.add(new Pizza("Portuguesa", "Queijo, presunto, ovo e molho de tomate", "Uma das pizza bem recheada", "Lactoze,corante,ovo,care de porco", R.drawable.portuguesa, 100.00, 5.00));

        return pizzas;
    }
}