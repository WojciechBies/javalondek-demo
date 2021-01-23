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

        String nullString = null;
        nullString.concat("ala ma kota");
    }
}
