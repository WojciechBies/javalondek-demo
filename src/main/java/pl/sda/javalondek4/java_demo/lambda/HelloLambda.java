package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {

    public static void main(String[] args) {
        RunnerImplementation myRunner = new RunnerImplementation();
        myRunner.walk();

        Runner runner = new RunnerImplementation();
       // runner.walk(); - doesn't compile

        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {

            }
        };
        anonymousRunner.go();
        handlerRunner(new Runner() {
            @Override
            public void go() {
                System.out.println("runner");
            }
        });
    }

    public static void handlerRunner(Runner runner) {
        System.out.println("handleRunner()");
        runner.go();
    }
}
