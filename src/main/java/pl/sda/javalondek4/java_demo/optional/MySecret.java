package pl.sda.javalondek4.java_demo.optional;

import java.util.Objects;

import static java.util.Objects.*;

public class MySecret {
    private String secret;

    public MySecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "MySecret{" +
                "secret='" + secret + '\'' +
                '}';
    }

    public static void main(String[] args) {
        MySecret realOne = new MySecret("I like...");
        MySecret withNullContent = new MySecret(null);
        MySecret.printSecretLength(realOne);
        MySecret.printSecretLength(withNullContent);

    }

    public static void printSecretLength(MySecret mySecret) {

         int secret = mySecret.getSecret() != null ? mySecret.getSecret().length() : 0;
         secret = nonNull(mySecret.getSecret()) ? mySecret.getSecret().length() : 0;



        System.out.println(secret);
    }
}
