package pl.sda.javalondek4.java_demo.lambda.calculator;

@FunctionalInterface
public interface Multiply<T>{

    T mult(T a, T b);
}
