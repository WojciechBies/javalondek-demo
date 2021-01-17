package pl.sda.javalondek4.java_demo.lambda;

public class RunnerImplementation implements Runner{

    @Override
    public void go() {
        System.out.println("Dawaj");
    }

    @Override
    public void go(int speed) {
        System.out.println("Speed is" + speed);
    }

    public void walk() {
    }
}
