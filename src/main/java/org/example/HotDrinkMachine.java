package org.example;
import java.util.List;

public class HotDrinkMachine implements VendingMachine {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }
    @Override
    public Product getProduct(String name) {
        for (Product item : productList)
            if(item.getName().equals(name))
                return item;
        return null;
    }

    public void getProduct(int name, int volume, int temperature) {
        for (Product item : productList)
            if (item.getName().equals(name)) &()
    }
}
