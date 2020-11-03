package com.company;

import java.util.ArrayList;

public class Mill extends Object{
    int mass;
    int price;

    ArrayList<String> comp = new ArrayList<>(); //TODO: comp can be null. Should fix it Soon
    String name;
    private int temperature = 25;

    public Mill(int mass, int price, ArrayList<String> comp, String name, int temperature) {
        this.mass = mass;
        this.price = price;
        this.comp = comp;
        this.name = name;
        this.temperature = temperature;
    }

    public Mill(int mass, int price, String name, int temperature) {
        this.mass = mass;
        this.price = price;
        this.name = name;
        this.temperature = temperature;
    }



    Mill warmUp(int temperature){
        this.temperature = temperature;
        return this;
    }

    void delete(){
        mass = 0;
        price = 0;
        comp = null;
        name = null;
        temperature = 0;
    }

    @Override
    public String toString() {
        return name + " с температурой " + temperature +", состоящая(-ее) из " +
                comp + " " +
                "с весом " + mass + " грамм" +
                ", это обошлось нам в " + price + " рублей " +
                "\n";
    }
}
