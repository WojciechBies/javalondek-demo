package pl.sda.javalondek4.java_demo.optional.java8;

import pl.sda.javalondek4.java_demo.optional.java7.Computer;
import pl.sda.javalondek4.java_demo.optional.java7.GraphicsCard;

import java.util.Optional;

public class ComputerUtils {

    private ComputerUtils() {
        throw new UnsupportedOperationException("This class shouldn't been instantiated");
    }



    public static String getGraphicsCardGoodApproach(Computer computer) {
        return Optional.ofNullable(computer)
                .map(computer1 -> computer1.getGraphicsCard())
                .map(graphicsCard -> graphicsCard.getModel())
                .orElse("no model");



    }

    public static void main(String[] args) {

        Computer withoutGraphicsCard = new Computer(null);
        Computer withUnknownModel = new pl.sda.javalondek4.java_demo.optional.java8.Computer(new pl.sda.javalondek4.java_demo.optional.java8.GraphicsCard())
        Computer personalComputer = new Computer(new GraphicsCard("nVidia RTX 380"));


    }
}
