package Lesson6;

public class MethodOverloading {

    void show(int i1){
        System.out.println(i1);
        System.out.println("Data type is int");
    }

    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }

    void show(String s1){
        System.out.println(s1);
        System.out.println("Data type is string");
    }

    void show(String s, int a){
        System.out.println("String: " + s + " int: " + a);
        System.out.println("Data types is string and int");
    }

    void show( int a, String s){
        System.out.println("The day is wonderful");
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        int a = 500;
        methodOverloading.show(a);
        boolean b = true;
        methodOverloading.show(b);
        String s = "String";
        methodOverloading.show(s);
        methodOverloading.show("privet", 10);
        methodOverloading.show(10, "privet");
    }
}
