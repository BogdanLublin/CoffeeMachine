package org.example.coffeemachine;


import static org.example.coffeemachine.CoffeeMachine.SCANNER;

public class CoffeeMachineController {
    private final CoffeeMaker coffeeMaker;
    private final CoffeeMachineFiller coffeeMachineFiller;

    public CoffeeMachineController(CoffeeMaker coffeeMaker, CoffeeMachineFiller coffeeMachineFiller) {
        this.coffeeMaker = coffeeMaker;
        this.coffeeMachineFiller = coffeeMachineFiller;
    }


    public void action(CoffeeMachineStatus coffeeMachineStatus) {

        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String currentAction = SCANNER.nextLine().toLowerCase();
        switch (currentAction) {
            case "buy":
                coffeeMachineStatus = coffeeMaker.makeCoffee(coffeeMachineStatus);
                action(coffeeMachineStatus);
                break;

            case "fill":
                coffeeMachineStatus = coffeeMachineFiller.coffeeFiller(coffeeMachineStatus);
                action(coffeeMachineStatus);
                break;
            case "take":
                System.out.println("I gave you " + coffeeMachineStatus.getCurrentMoney());
                coffeeMachineStatus.setCurrentMoney(0);
                action(coffeeMachineStatus);
                break;
            case "remaining":
                currentStatus(coffeeMachineStatus);
                action(coffeeMachineStatus);
                break;
            case "exit":
                break;

        }
    }

    private static void currentStatus(CoffeeMachineStatus coffeeMachineStatus) {
        System.out.println("this coffee machine has:");
        System.out.println(coffeeMachineStatus.getCurrentWater() + " ml of water");
        System.out.println(coffeeMachineStatus.getCurrentMilk() + " ml of milk");
        System.out.println(coffeeMachineStatus.getCurrentCoffeeBeans() + " g of coffee beans");
        System.out.println(coffeeMachineStatus.getCurrentDisposableCups() + " disposable cups");
        System.out.println("$" + coffeeMachineStatus.getCurrentMoney() + " of money");
        System.out.println();
    }
}

