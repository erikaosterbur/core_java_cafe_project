package com.teksystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Espresso espresso = new Espresso();
        Cappuccino cappuccino = new Cappuccino();

        Scanner input = new Scanner(System.in);
        System.out.println("How many coffees would you like?");
        int coffeeQuantity = input.nextInt();
        coffee.setQuantity(coffeeQuantity);
        double coffeeSubtotal = coffee.calculateProductTotal();
        System.out.println(coffee.getName() + " " + coffee.getDescription() + " Subtotal: " + coffee.calculateProductTotal());

        System.out.println("How many espressos would you like?");
        int espressoQuantity = input.nextInt();
        espresso.setQuantity(espressoQuantity);
        double espressoSubtotal = espresso.calculateProductTotal();
        System.out.println(espresso.getName() + " " + espresso.getDescription() + " Subtotal: " + espresso.calculateProductTotal());

        System.out.println("How many cappuccinos would you like?");
        int cappuccinoQuantity = input.nextInt();
        cappuccino.setQuantity(cappuccinoQuantity);
        double cappuccinoSubtotal = cappuccino.calculateProductTotal();
        System.out.println(cappuccino.getName() + " " + cappuccino.getDescription() + " Subtotal: " + cappuccino.calculateProductTotal());

        double salesSubtotal = coffeeSubtotal + espressoSubtotal + cappuccinoSubtotal;
        double salesTax = salesSubtotal * .0685;
        double salesTotal = salesSubtotal + salesTax;

        System.out.printf("Order Subtotal: %.2f \n Sales Tax: %.4f \n Sales Total: %.2f",salesSubtotal,salesTax,salesTotal);



    }
}
