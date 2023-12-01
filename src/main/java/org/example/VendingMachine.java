package org.example;
import java.util.List;

public interface VendingMachine {
    public void initProduct(List<HotDrink> productList);
    public HotDrink getProduct(String name);
}
