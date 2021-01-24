package pl.sda.javalondek4.java_demo.optional;

import java.util.Optional;

import static java.util.Objects.*;

public class MySecret<T> {
    private T secret;

    public MySecret(T secret) {
        this.secret = secret;
    }

    public T getSecret() {
        return secret;
    }

    public void setSecret(T secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "MySecret{" +
                "secret='" + secret + '\'' +
                '}';
    }

    public static void main(String[] args) {
        MySecret<String> realOne = new MySecret<>("I like...");
        MySecret<String> withNullContent = new MySecret<>(null);
        MySecret.printSecretLength(realOne);
        MySecret.printSecretLength(withNullContent);

        Optional<Integer> number = Optional.of(42);
        Optional<Integer> nullNumber = Optional.empty();



    }

    public static void printSecretLength(MySecret<String> mySecret) {

         int secret = mySecret.getSecret() != null ? mySecret.getSecret().length() : 0;
         secret = nonNull(mySecret.getSecret()) ? mySecret.getSecret().length() : 0;



        System.out.println(secret);
    }
}
