package HomeWork.Lesoon8;

public class HomeWork8 {

    static final double pi = 3.14;

    public double areaOfCircle (double r){
        double result = r*r*pi;
        System.out.println(" result of areaOfCircle " + result);
        return result;
    }

    public static double circuitOfCircle2 (double r){
        double result = r*2*pi;
        System.out.println(" result of circuitOfCircle2 " + result);
        return result;
    }

    public void useOfAllMethods (double r){
        System.out.println("radius is " +r);
        System.out.println(circuitOfCircle2(r));
        System.out.println(areaOfCircle(r));
    }

    public static int multiplicationOfThreeNum(int a, int b, int c){
        int result = a*b*c;
        System.out.println(" result of multiplicationOfThreeNum " + result);
        return result;
    }

    public static void divisionOfThreeNum(int a, int b){
        double result = a/b;
        System.out.println(" result of divisionOfThreeNum " + result);
        System.out.println(" result of division " + result);
    }
}

class HomeWork8Test{

    public static void main(String[] args) {
        HomeWork8 hw = new HomeWork8();
        hw.multiplicationOfThreeNum(5,3,7);
        hw.multiplicationOfThreeNum(4,5,6);

        hw.divisionOfThreeNum(15,4);
        hw.divisionOfThreeNum(20,4);

        hw.useOfAllMethods(15);
        hw.areaOfCircle(20);
        hw.circuitOfCircle2(30);
    }
}
