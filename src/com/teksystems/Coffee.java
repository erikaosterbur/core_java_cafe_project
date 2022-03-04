package com.teksystems;

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
}
