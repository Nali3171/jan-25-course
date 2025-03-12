package src.main.java.org.example;

public class circleDemo {
    public static void main(String[] args) {
        circle unitCircle = new circle();
        circle myCircle = new circle(5);
        circle yourCircle = new circle(12.75);

        printCircleData(unitCircle);
        printCircleData(myCircle);
        printCircleData(yourCircle);


    }
    public static void printCircleData(circle Circle){
        System.out.println("r = "+ circle.getRadius());
        System.out.println("c = "+ circle.circumference());
        System.out.println("A = "+ circle.area());

    }
}
