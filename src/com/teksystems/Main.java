package com.teksystems;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //FROM PROJECT 2:
//        Coffee coffee = new Coffee();
//        Espresso espresso = new Espresso();
//        Cappuccino cappuccino = new Cappuccino();
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("How many coffees would you like?");
//        int coffeeQuantity = input.nextInt();
//        coffee.setQuantity(coffeeQuantity);
//        coffee.addOptions();
//        double coffeeSubtotal = coffee.calculateProductTotal();
//        System.out.println(coffee.getName() + " " + coffee.getDescription() + " Subtotal: " + coffeeSubtotal);
//        coffee.printOptions();
//
//        System.out.println("How many espressos would you like?");
//        int espressoQuantity = input.nextInt();
//        espresso.setQuantity(espressoQuantity);
//        double espressoSubtotal = espresso.calculateProductTotal();
//        System.out.println(espresso.getName() + " " + espresso.getDescription() + " Subtotal: " + espressoSubtotal);
//
//        System.out.println("How many cappuccinos would you like?");
//        int cappuccinoQuantity = input.nextInt();
//        cappuccino.setQuantity(cappuccinoQuantity);
//        double cappuccinoSubtotal = cappuccino.calculateProductTotal();
//        System.out.println(cappuccino.getName() + " " + cappuccino.getDescription() + " Subtotal: " + cappuccinoSubtotal);
//
//        double salesSubtotal = coffeeSubtotal + espressoSubtotal + cappuccinoSubtotal;
//        double salesTax = salesSubtotal * .0685;
//        double salesTotal = salesSubtotal + salesTax;
//
//        System.out.printf("Order Subtotal: %.2f \n Sales Tax: %.4f \n Sales Total: %.2f",salesSubtotal,salesTax,salesTotal);

        Scanner input = new Scanner(System.in);

        ArrayList<Product> shoppingCart = new ArrayList<>();


            loop:
        while(true){
            System.out.println("Please select from the following menu:\n 1. Coffee\n 2. Cappuccino\n 3. Espresso\n 4. Check Out");
            switch(input.nextInt()){
                case 1:
                    Coffee coffee = new Coffee();
                    coffee.setQuantity(1);
                    coffee.addOptions(input);
                    shoppingCart.add(coffee);
                    break;

                case 2:
                    Cappuccino cappuccino = new Cappuccino();
                    cappuccino.setQuantity(1);
                    cappuccino.addOptions(input);
                    shoppingCart.add(cappuccino);
                    break;

                case 3:
                    Espresso espresso = new Espresso();
                    espresso.setQuantity(1);
                    espresso.addOptions(input);
                    shoppingCart.add(espresso);
                    break;

                case 4:
                    shoppingCart.forEach(sc -> {
                        System.out.printf("Item: %s Price: %.2f Quantity: %d Subtotal: %.2f\n %s\n", sc.getName(), sc.getPrice(), sc.getQuantity(), sc.calculateProductTotal(), sc.printOptions());
                    });


                    break loop;

                default:
                    System.out.println("That is not a valid option");
            }
        }


    }
}
