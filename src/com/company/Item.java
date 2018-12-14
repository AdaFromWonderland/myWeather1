package com.company;

import java.util.Scanner;

public class Item {
    Scanner sc = new Scanner(System.in);

    private double price;
    private String name;
    Item(String name, double price ){
        this.name= name;
        this.price = price;
        if(price< 0){
            this.price=0;
        }
    }

    String getName() {
        return name;
    }



    public double getPrice() {
        return price;
    }



    void upPrise(double procent){
        double x = ((this.price*procent)/100);
        System.out.println("x = "+x);
        this.price = this.price + x;
        System.out.println("price  = "+this.price);

    }

    void downPrise(double procent1){
        double x = ((this.price*procent1)/100);
        System.out.println("x = "+x);
        this.price = this.price - x;
        if(this.price <0){
            System.out.println("Ввели фигню какую то ,аж стыдно за вас фу фу фу.");
            this.price =0;

        }
        else {
            System.out.println("price  = " + this.price);
        }
    }


}

