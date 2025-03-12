package src.main.java.org.example;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("Sum of two int numbers: " + add(10, 20));
        System.out.println("Sum of two long numbers: " + add(30, 40));
        System.out.println("sum of two double numbers: " + add(50, 60));


    }
    public static int add(int x, int y){
        return x + y;
    }
    static long add(long x, long y){
        return x + y ;
    }
    protected static double add( double x, double y){
        return x + y;
    }

}
