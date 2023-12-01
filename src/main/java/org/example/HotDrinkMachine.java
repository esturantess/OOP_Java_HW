package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachine {
    private List<HotDrink> drinksList = new ArrayList<>();

    @Override
    public void initProduct(List<HotDrink> productList) {

        this.drinksList = productList;
    }

    @Override
    public HotDrink getProduct(String name) {
        for (HotDrink item : drinksList)
            if (item.getName().equals(name))
                return item;
        return null;
    }

    public HotDrink getProduct (String name, int cost, int temperature) {
        for (HotDrink item : drinksList) {
            if (item.getName().equals(name) & item.getCost() == cost && (((Coffee) item).getTemperature() == temperature))
                return item;
        }
        return null;
    }


}
