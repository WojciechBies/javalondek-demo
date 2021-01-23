package pl.sda.javalondek4.java_demo.lambda;

public interface WorkLifeBalance {
    void hardWork();

    default void sleep(int time) {

    }

    public static void main(String[] args) {

        WorkLifeBalance workLifeBalance = new WorkLifeBalance() {
            @Override
            public void hardWork() {
                System.out.println("work");
            }

            @Override
            public void sleep(int time) {
                System.out.println("sleep");
            }
        };
        WorkLifeBalance lambda = () -> System.out.println("work");

    }
}
