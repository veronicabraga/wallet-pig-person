package org.academiadecodigo.bootcamp;

public class Person {

    private String name;
    private Wallet wallet;
    private Pig pig;

    public Person(String name, double moneyW, double moneyP){
        this.name = name;
        wallet = new Wallet(moneyW);
        pig = new Pig(moneyP);
    }

    public void useMoneyFromWallet(double num) {
        wallet.addMoney(num);
    }

    public void transferMoneyForPig(double num) {
        wallet.subtractMoney(num);
        pig.addMoney(num);
    }

    public void transferMoneyForWallet(double num) {
        pig.subtractMoney(num);
        wallet.addMoney(num);
    }

    public String getMoneyWallet(){
        return "You have " + wallet.getMoney() + " euros in your wallet.";
    }

    public String getMoneyPig(){
        return "You have " + pig.getMoney() + " euros in your pig.";
    }

}
