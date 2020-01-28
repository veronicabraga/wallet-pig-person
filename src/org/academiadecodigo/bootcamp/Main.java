package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Vero", 50, 20);

        person1.transferMoneyForPig(20);
        System.out.println(person1. getMoneyWallet());

        person1.transferMoneyForPig(20);
        System.out.println(person1. getMoneyWallet());
        System.out.println(person1. getMoneyPig());

        person1.transferMoneyForPig(20);
        System.out.println(person1. getMoneyWallet());
        System.out.println(person1. getMoneyPig());

        person1.transferMoneyForWallet(10);
        System.out.println(person1. getMoneyWallet());
        System.out.println(person1. getMoneyPig());

        person1.transferMoneyForWallet(10);
        System.out.println(person1. getMoneyWallet());
        System.out.println(person1. getMoneyPig());

        person1.useMoneyFromWallet(15);

    }
}
