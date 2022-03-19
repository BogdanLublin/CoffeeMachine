package org.example.coffeemachine;

public enum CoffeeTypes {

    ESPRESSO(new Coffee(250, 0, 16, 4)),
    LATTE(new Coffee(350, 75, 20, 7)),
    CAPPUCCINO(new Coffee(200, 100, 12, 6));

    private final Coffee coffee;

    CoffeeTypes(Coffee coffee) {
        this.coffee = coffee;
    }


    public Coffee getCoffee() {
        return coffee;
    }
}
