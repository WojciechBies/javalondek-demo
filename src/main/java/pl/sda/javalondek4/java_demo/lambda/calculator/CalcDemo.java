package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calc lambda");

        Adder adder = (a, b) -> a + b;

        StrangeOne strangeOne = (a, b) -> a + b;

        MyAdder myAdder = (a, b, comment) -> {
            System.out.println(comment);
            return a + b;
        };
        adder.add(5, 5);

        Substraction substraction = (a, b) -> a - b;

        Multiply multiply = (a, b) -> a * b;

        Division division = (a, b) -> a / b;
    }
}
