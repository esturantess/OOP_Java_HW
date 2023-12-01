package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> drinkList = new ArrayList<>();

        Coffee Latte = new Coffee("Latte", 250, 75);
        drinkList.add(Latte);
        drinkList.add(new Coffee("Americano", 180, 70));
        drinkList.add(new Coffee("Cappuccino", 230, 80));
        Coffee BigLatte = new Coffee("Big Latte", 300, 99);

        System.out.println(BigLatte.getCost());
        BigLatte.setTemperature(50);
        System.out.println(BigLatte.getTemperature());
        System.out.println(BigLatte.getName());
        drinkList.add(BigLatte);

        HotDrinkMachine RoboInnokentiy = new HotDrinkMachine();
        HotDrinkMachine Beerglory = new HotDrinkMachine();
        HotDrinkMachine RoboOvsyanka = new HotDrinkMachine();

        RoboInnokentiy.initProduct(drinkList);
        System.out.println(RoboInnokentiy.getProduct("Americano", 180, 70));
        Beerglory.initProduct(drinkList);
        System.out.println(Beerglory.getProduct("Latte"));
        RoboOvsyanka.initProduct(drinkList);
        System.out.println(RoboOvsyanka.getProduct("Cappuccino enormous"));
        System.out.println(RoboOvsyanka.getProduct("Big Latte"));
    }
}