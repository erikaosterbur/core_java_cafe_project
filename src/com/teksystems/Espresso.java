package com.teksystems;

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
}
