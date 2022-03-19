package org.example.coffeemachine;

public class CoffeeMachineStatus {
    private int currentWater;
    private int currentMilk;
    private int currentCoffeeBeans;
    private int currentDisposableCups;


    private int currentMoney;

    public CoffeeMachineStatus(int currentWater, int currentMilk, int currentCoffeeBeans, int currentDisposableCups, int currentMoney) {
        this.currentWater = currentWater;
        this.currentMilk = currentMilk;
        this.currentCoffeeBeans = currentCoffeeBeans;
        this.currentDisposableCups = currentDisposableCups;
        this.currentMoney = currentMoney;
    }

    public CoffeeMachineStatus changeMachineStatus(Coffee coffee) {
        this.currentWater -= coffee.getWater();
        this.currentMilk -= coffee.getMilk();
        this.currentCoffeeBeans -= coffee.getCoffeeBeans();
        this.currentMoney += coffee.getCost();
        this.currentDisposableCups -= 1;
        return this;
    }

    public CoffeeMachineStatus changeMachineStatus(int currentWater, int currentMilk, int currentCoffeeBeans, int currentDisposableCups) {
        this.currentWater += currentWater;
        this.currentMilk += currentMilk;
        this.currentCoffeeBeans += currentCoffeeBeans;
        this.currentDisposableCups += currentDisposableCups;
        return this;
    }

    public int getCurrentWater() {
        return currentWater;
    }


    public int getCurrentMilk() {
        return currentMilk;
    }

    public int getCurrentCoffeeBeans() {
        return currentCoffeeBeans;
    }

    public int getCurrentDisposableCups() {
        return currentDisposableCups;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }
}
