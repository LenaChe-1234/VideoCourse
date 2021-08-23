package HomeWork;

public class HomeWorkLesson6 {

    int sum (int a, int b, int c, int d , int e){
        System.out.println("Sum of five int ");
        return a+b+c+d+e;
    }
    int sum (int a){
        System.out.println("Only one numbers is given");
        return a;
    }

    int sum (int a, int b){
        System.out.println("Sum of two int ");
        return a+b;
    }

    int sum (int a, int b, int c){
        System.out.println(" Sum of three int ");
        return a+b+c;
    }

    int sum (int a, int b, int c, int d){
        System.out.println(" Sum of four int ");
        return a+b+c+d;
    }


    int sum(){
        System.out.println("Empty date  ");
        return 0;
    }
}


class HomeWorkLesoon6Test{
    public static void main(String[] args) {
        HomeWorkLesson6 hWL6 = new HomeWorkLesson6();

        System.out.println( "Test of first method");
        int sum1 = hWL6.sum(1,3,4,45,55);
        System.out.println(" Result " + sum1);
        System.out.println( "Test of second method");
        int sum2 = hWL6.sum(110);
        System.out.println(" Result " + sum2);
        System.out.println( "Test of third method");
        int sum3 = hWL6.sum(1,-3);
        System.out.println(" Result " + sum3);
        System.out.println( "Test of fourth method");
        int sum4 = hWL6.sum(3,4,45,55);
        System.out.println(" Result " + sum4);
        System.out.println( "Test of fifth method");
        int sum5 = hWL6.sum();
        System.out.println(" Result " + sum5);
    }
}