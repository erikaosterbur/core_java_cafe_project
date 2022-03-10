package com.teksystems;

import java.util.Scanner;

public class Coffee extends Product {
    private boolean sugar;
    private boolean milk;

    public Coffee() {
        super("Coffee", 2.50, "Dark Roast");
        this.sugar = false;
        this.milk = false;
    }

    public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
        super(name, price, description);
        this.sugar = sugar;
        this.milk = milk;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    @Override
    public double calculateProductTotal() {
        return this.getQuantity() * this.getPrice();
    }

    @Override
    public void addOptions(Scanner input) {
        //ask if they want sugar
        System.out.print("Do you want sugar in your coffee?\n 1: Yes\n 2: No");
        int userSugar = input.nextInt();
        //setSugar
        setSugar(userSugar == 1);
        //ask if they want milk
        System.out.print("Do you want milk in your coffee?\n 1: Yes\n 2: No");
        int userMilk = input.nextInt();
        //setMilk
        setMilk(userMilk == 1);
    }

    @Override
    public String printOptions(){
        if(this.milk && this.sugar){
           return "Sugar: Yes Milk: Yes";
        } else if (this.milk && !this.sugar){
            return "Sugar: No Milk: Yes";
        } else if (this.sugar && !this.milk){
            return "Sugar: Yes Milk: No";
        } else {
            return "Sugar: No Milk: No";
        }
    }
}
