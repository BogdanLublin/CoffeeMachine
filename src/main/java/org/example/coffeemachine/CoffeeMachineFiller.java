package org.example.coffeemachine;

import java.util.Scanner;

public class CoffeeMachineFiller {
    Scanner scanner = new Scanner(System.in);

    public CoffeeMachineStatus coffeeFiller(CoffeeMachineStatus coffeeMachineStatus) {
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addDisposableCups = scanner.nextInt();
        return coffeeMachineStatus.changeMachineStatus(addWater, addMilk, addCoffeeBeans, addDisposableCups);
    }
}
