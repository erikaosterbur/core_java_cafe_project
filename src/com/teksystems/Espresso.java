package com.teksystems;

import java.util.Scanner;

public class Espresso extends Product{
    private boolean extraShot;
    private boolean macchiato;

    public Espresso() {
        super("Espresso", 3.50, "Concentrated form of coffee served in a small, strong shot");
        this.extraShot = false;
        this.macchiato = false;
    }

    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
        super(name, price, description);
        this.extraShot = extraShot;
        this.macchiato = macchiato;
    }

    public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }

    @Override
    public double calculateProductTotal() {
        double addShot = (this.extraShot ? 2.00 : 0);
        double addMacchiato = (this.macchiato ? 1.00 : 0);
        return (this.getQuantity() * this.getPrice()) + addMacchiato + addShot;
    }

    @Override
    public void addOptions(Scanner input) {
        //ask if they want an extra shot
        System.out.print("Do you want an extra shot?\n 1: Yes\n 2: No");
        int userExtraShot = input.nextInt();
        //setExtraShot
        setExtraShot(userExtraShot == 1);
        //ask if they want a macchiato
        System.out.print("Do you a macchiato?\n 1: Yes\n 2: No");
        int userMacchiato = input.nextInt();
        //setMacchiato
        setMacchiato(userMacchiato == 1);
    }

    @Override
    public String printOptions() {
        if(this.extraShot && this.macchiato){
            return "Extra Shot: Yes (+$2.00) Macchiato: Yes (+$1.00)";
        } else if(this.extraShot && !this.macchiato){
            return "Extra Shot: Yes (+$2.00) Macchiato: No";
        } else if(this.macchiato && !this.extraShot){
            return "Extra Shot: No Macchiato: Yes (+$1.00)";
        } else {
            return "Extra Shot: No Macchiato: No";
        }
    }

}
