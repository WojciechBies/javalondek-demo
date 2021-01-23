package pl.sda.javalondek4.java_demo.lambda.homework;

public class Runner {

    public static void main(String[] args) {

        Playable<Player> footballPlayer = (player) -> player.getPlayerName();
        footballPlayer.play(new Player("Ronaldo"));

        Playable<Game> gamePlayer = (game) -> game.getName();
        gamePlayer.play(new Game("GTA V"));

    }

}
