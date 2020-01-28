package org.academiadecodigo.bootcamp;

public class Pig {

    private double money;

    public Pig(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double num) {
        money = money + num;
        System.out.println("Great! It was added " + num + " euros in your pig.");
    }

    public void subtractMoney(double num) {
        if (money >= num) {
            money = money - num;
            System.out.println("Great! It was subtract " + num + " euros from your pig.");
        } else {
            System.out.println("I am sorry, you don't have money enough in your pig to subtract " + num + " euros.");
        }

    }
}
