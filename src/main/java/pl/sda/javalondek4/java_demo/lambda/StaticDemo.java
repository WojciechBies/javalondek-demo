package pl.sda.javalondek4.java_demo.lambda;

public class StaticDemo {

    public static void demo() {
        System.out.println("static demo");
    }

    public static void main(String[] args) {
        StaticDemo.demo();
        demo();

        StaticDemo empty = null;
        empty.demo();
    }
}
