package Lesson4;

public class Car {
    Car(String cvet, String motor){
        color = cvet;
        engine = motor;

        System.out.println("Цвет машины: " + color + " мотор машины: " + engine);
    }

    Car(){
        System.out.println("Object  is created");
    }

    String color;
    String engine;

}

class CarTest {

    public static void main(String[] args){
        Car car1 = new Car("white", "v8");
        Car car2 = new Car();

        System.out.println(car1.color);
        System.out.println(car1.engine);
        System.out.println("Car1 color " + car1.color +" and car1 engine " + car1.engine + ".");

        Car car3 = new Car("blue", "v2");
        Car car4 = new Car("grey", "v9");
    }
}