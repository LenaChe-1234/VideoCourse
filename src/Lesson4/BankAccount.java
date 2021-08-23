package Lesson4;

public class BankAccount {

    int id = 10;
    String name = "Felix";
    double balance = 25.25;

    void popolnenieScheta(double summToAdd){
        System.out.println(" Balance do popolnenia " + balance);
        System.out.println(" Summa popolnenia " + summToAdd);
        balance += summToAdd;
        System.out.println(" Balance posle popolnenia " + balance);
        System.out.println();

    }

    void snatieSoScheta(double summToRetrieve){
        System.out.println(" Balance do snatia " + balance);
        System.out.println(" Summa snatia " + summToRetrieve);
        balance -= summToRetrieve;
        System.out.println(" Balance posle snatia " + balance);
        System.out.println();
    }
}

class BankAccountTest{

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Lena";
        myAccount.balance = 12.35;

        yourAccount.id = 2;
        yourAccount.name = "Mike";


        hisAccount.id = 3;
        hisAccount.name = "Oskar";
        hisAccount.balance = 124.12;

//        System.out.println(myAccount.id);
//        System.out.println(yourAccount.balance);

        myAccount.popolnenieScheta(500);
        myAccount.snatieSoScheta(30.30);
    }
}
