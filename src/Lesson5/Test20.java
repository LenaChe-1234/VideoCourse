package Lesson5;

public class Test20 {

    int  sum(int a, int b, int c){
        int result = a+b+c;
        return result;
    }

    int avgTrechChisel(int a1, int b1, int c1){
        int result2 = sum(a1,b1,c1)/3;
        return result2;
    }
}

class Test12{

    public static void main(String[] args) {
        Test20 t = new Test20();
        int summaTrechCHisel = t.sum(1,2,3);
        System.out.println(summaTrechCHisel);
        System.out.println(t.sum(15,25,3));
        System.out.println(t.avgTrechChisel(24,49,61 ));
    }
}

