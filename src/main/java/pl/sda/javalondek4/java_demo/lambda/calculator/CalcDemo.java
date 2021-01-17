package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calc lambda");

        Adder adder = (a, b) -> a + b;

        StrangeOne strangeOne = (a, b) -> a+b;
    }
}
