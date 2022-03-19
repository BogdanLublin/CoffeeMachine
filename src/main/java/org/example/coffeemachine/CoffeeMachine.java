package org.example.coffeemachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {


        final CoffeeMachineStatus coffeeMachineStatus = new CoffeeMachineStatus(400, 540, 120, 9, 550);
        final CoffeeMaker coffeeMaker = new CoffeeMaker();
        final CoffeeMachineFiller coffeeMachineFiller = new CoffeeMachineFiller();
        final CoffeeMachineController coffeeMachineController = new CoffeeMachineController(coffeeMaker, coffeeMachineFiller);

        coffeeMachineController.action(coffeeMachineStatus);
    }
}



