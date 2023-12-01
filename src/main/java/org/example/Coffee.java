package org.example;

public class Coffee extends HotDrink{
    private int temperature;

    public Coffee (String name, int cost, int temperature){
        super(name, cost);
        this.temperature = temperature;
    }
    public void setTemperature(int temperature) {

        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Coffee {" +
                "name='" + this.getName() + '\'' +
                ", cost=" + this.getCost() + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
