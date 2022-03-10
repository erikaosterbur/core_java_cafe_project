package com.teksystems;

import java.util.Scanner;

public class Cappuccino extends Product{
    private boolean peppermint;
    private boolean whippedCream;

    public Cappuccino() {
        super("Cappuccino", 3.50, "Espresso coffee topped with frothed hot milk");
        this.peppermint = false;
        this.whippedCream = false;
    }

    public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
        super(name, price, description);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    public boolean isPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    @Override
    public double calculateProductTotal() {
        double addPeppermint = (this.peppermint ? 2.00 : 0);
        double addWhip = (this.whippedCream ? 1.00 : 0);
        return (this.getQuantity() * this.getPrice()) + addPeppermint + addWhip;
    }

    @Override
    public void addOptions(Scanner input) {
        //ask if they want peppermint
        System.out.print("Do you want peppermint in your cappuccino?\n 1: Yes\n 2: No");
        int userPeppermint = input.nextInt();
        //setSugar
        setPeppermint(userPeppermint == 1);
        //ask if they want whipped cream
        System.out.print("Do you want whipped cream on your cappuccino?\n 1: Yes\n 2: No");
        int userWhip = input.nextInt();
        //setWhip
        setWhippedCream(userWhip == 1);
    }

    @Override
    public String printOptions() {
        if(this.whippedCream && this.peppermint){
            return "Peppermint: Yes (+$2.00) Whipped Cream: Yes (+$1.00)";
        } else if(this.peppermint && !this.whippedCream){
            return "Peppermint: Yes (+$2.00) Whipped Cream: No";
        } else if(this.whippedCream && !this.peppermint){
            return "Peppermint: No Whipped Cream: Yes (+$1.00)";
        } else {
            return "Peppermint: No Whipped Cream: No";
        }
    }

}
