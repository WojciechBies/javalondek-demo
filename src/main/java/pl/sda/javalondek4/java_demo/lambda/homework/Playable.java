package pl.sda.javalondek4.java_demo.lambda.homework;

@FunctionalInterface
public interface Playable<T> {

    String play(T t);
}
