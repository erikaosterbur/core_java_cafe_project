package com.teksystems;

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

    @Override
    public double calculateProductTotal() {
        double addPeppermint = (this.peppermint ? 2.00 : 0);
        double addWhip = (this.whippedCream ? 1.00 : 0);
        return (this.getQuantity() * this.getPrice()) + addPeppermint + addWhip;
    }
}
