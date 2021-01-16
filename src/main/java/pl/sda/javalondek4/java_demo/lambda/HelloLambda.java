package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {

    public static void main(String[] args) {
        Runner myRunner = new RunnerImplementation();

        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {

            }
        };
        anonymousRunner.go();
    }
}
