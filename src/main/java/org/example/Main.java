package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> drinkList = new ArrayList<>();

        drinkList.add(new Coffee("Latte", 250, 75));
        drinkList.add(new Coffee("Americano", 180, 70));
        drinkList.add(new Coffee("Cappuccino", 230, 80));

        HotDrinkMachine RoboInnokentiy = new HotDrinkMachine();
        HotDrinkMachine Beerglory = new HotDrinkMachine();
        HotDrinkMachine RoboOvsyanka = new HotDrinkMachine();

        RoboInnokentiy.initProduct(drinkList);
        System.out.println(RoboInnokentiy.getProduct("Americano", 180, 70));
        Beerglory.initProduct(drinkList);
        Beerglory.
        RoboOvsyanka.initProduct(drinkList);


    }
}