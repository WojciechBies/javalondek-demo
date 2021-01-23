package pl.sda.javalondek4.java_demo.exception;

public class ExceptionExample {

    public static void main(String[] args) {

        ExceptionGenerator exg = new ExceptionGenerator();

        String myNick;
        try {
            myNick = exg.nick();
        } catch (NoNickException e) {
            e.printStackTrace();
            myNick = "this user have no nick";
        }
        System.out.println("My nick is: " + myNick);

        System.out.println("Now with runtime exception");

        String s = exg.nickWithRuntimeException();
        System.out.println(s);

        String nullString = null;
        nullString.concat("ala ma kota");
    }
}
