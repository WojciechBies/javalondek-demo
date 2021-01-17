package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calc lambda");

        Adder<Integer> adder = (a, b) -> a + b;

        StrangeOne strangeOne = (a, b) -> a + b;

        MyAdder myAdder = (a, b, comment) -> {
            System.out.println(comment);
            return a + b;
        };
        adder.add(5, 5);

        Substraction<Integer> substraction = (a, b) -> a - b;

        Multiply<Integer> multiply = (a, b) -> a * b;

        Division<Integer> division = (a, b) -> a / b;
    }
}
