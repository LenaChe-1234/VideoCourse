package Lesson5;

public class Car2 {

    String color2;
    String engine2;
    int speed;

    int gaz(int skorost){

        speed += skorost;
        return speed;
    }

    int tormoz(int skorost){

        speed -= skorost;
        return speed;
    }

     void showInfo(){
         System.out.println(" cvet: " + color2 );
         System.out.println(" motor: " + engine2 );
         System.out.println(" speed: " + speed);
     }
}

class Car2Test{

    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color2 = "white";
        c1.engine2 = "v6";
        c1.speed = 60;

        c1.showInfo();
        c1.gaz(20);
        c1.showInfo();
        c1.tormoz(80);
        c1.showInfo();
    }
}
