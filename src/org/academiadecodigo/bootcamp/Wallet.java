package org.academiadecodigo.bootcamp;

public class Wallet {

    private double money;

    public Wallet(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double num) {
        money = money + num;
        System.out.println("Great! It was added " + num + " euros in your wallet.");
    }

    public void subtractMoney(double num) {
        if (money >= num) {
            money = money - num;
            System.out.println("Great! It was subtract " + num + " euros from your wallet.");

        } else {
           System.out.println("I am sorry, you don't have money enough in your wallet to subtract " + num + " euros.");

        }
    }

}
