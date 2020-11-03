package com.company;

import java.util.ArrayList;
import java.util.Locale;
        import java.util.Scanner;
enum UserEvents {ON_FLAT_ENTER, ON_FRIDGE_OPEN};
public class Main{

    public static void main(String[] args)
    {
        ArrayList<String> comps = new ArrayList<>();
        comps.add("Spagetti");
        comps.add("Tomatoes");
        comps.add("Meatballs");

        UserEvents nowUserIs = UserEvents.ON_FLAT_ENTER; //TODO: Implement getters on setters for user bind geolocation notification service

        Mill spagetti = new Mill(10, 100, comps, "Спагетти", 20);
        Mill milk = new Mill(100, 100, "Молоко", 20);
        Mill lazania = new Mill(1320, 100, "Лазанья", 20);
        Mill sushi = new Mill(234, 100, "Суши", 20);

        ArrayList<Mill> allFridgeMills = new ArrayList<>();
        allFridgeMills.add(sushi);
        allFridgeMills.add(spagetti);
        allFridgeMills.add(milk);
        allFridgeMills.add(lazania);

        switch (nowUserIs){
            case ON_FLAT_ENTER:
                System.out.println("User opened fridge");
                System.out.println("In fridge we can see \n"+
                        allFridgeMills.toString());
                break;


            default:
                System.err.println("No such user state or user implementation in this version of smart house");


        }

        spagetti
                .warmUp(10)
                .warmUp(20)
                .warmUp(100);
    }
}














