package Lesson5;

public class Human {

    String name;
    Car3 car;
    BankAccount bA;

    void info(){
        System.out.println(" Name: " + name + " Car's color: " + car.color + " Balance in Bank Account: " + bA.balance);
    }
}

class HumanTest{

    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Oskar";
        h.car = new Car3("blue", "v8");
        h.bA = new BankAccount(11, 1000.50);
        h.info();
    }
}

class Car3{

    Car3(String cvet, String eng){
        color = cvet;
        engine = eng;
    }

    String color;
    String engine;
}

class BankAccount{

    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;
}
