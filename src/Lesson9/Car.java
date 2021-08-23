package Lesson9;

public class Car {

    int a = 10;
    String color;
    String engine;
    static int count;

    public Car(String color, String engine){
        this.count++;
        this.color = color;
        this.engine = engine;
    }

    public static void changeA (int b){
        Car c =  new Car("black", "V8");
        c.a = b;
    }

    public void showColor(){
        System.out.println("Цвет машины " + color);
        changeColor("rad");
    }

    public void changeColor(String color3){
        System.out.println("Цвет машины изменился");
        int cena = 5000;
        color = color3;
        cena += 1000;
    }
}
