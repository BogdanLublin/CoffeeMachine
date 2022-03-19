package org.example.coffeemachine;


import static org.example.coffeemachine.CoffeeMachine.SCANNER;
import static org.example.coffeemachine.CoffeeTypes.*;

public class CoffeeMaker {


    public CoffeeMachineStatus makeCoffee(CoffeeMachineStatus coffeeMachineStatus) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String whatDoYouWant = SCANNER.nextLine();
        switch (whatDoYouWant) {
            case "1":
                // espresso
                if (validate(ESPRESSO.getCoffee(), coffeeMachineStatus)) {
                    return coffeeMachineStatus.changeMachineStatus(ESPRESSO.getCoffee());
                }
                return coffeeMachineStatus;
            case "2":
                // latte
                if (validate(LATTE.getCoffee(), coffeeMachineStatus)) {
                    return coffeeMachineStatus.changeMachineStatus(LATTE.getCoffee());
                }
                return coffeeMachineStatus;
            case "3":
                // cappuccino
                if (validate(CAPPUCCINO.getCoffee(), coffeeMachineStatus)) {
                    return coffeeMachineStatus.changeMachineStatus(CAPPUCCINO.getCoffee());
                }
                return coffeeMachineStatus;
            case "back":
                break;
        }
        return coffeeMachineStatus;
    }

    private boolean validate(Coffee coffee, CoffeeMachineStatus coffeeMachineStatus) {
        if (coffeeMachineStatus.getCurrentWater() < coffee.getWater()) {
            System.out.println("Sorry, not enough water!");
            return false;
        } else if (coffeeMachineStatus.getCurrentMilk() < coffee.getMilk()) {
            System.out.println("Sorry, not enough milk!");
            return false;
        } else if (coffeeMachineStatus.getCurrentCoffeeBeans() < coffee.getCoffeeBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        } else if (coffeeMachineStatus.getCurrentDisposableCups() < 1) {
            System.out.println("Sorry, not enough disposable cups!");
            return false;
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            return true;
        }
    }


}
