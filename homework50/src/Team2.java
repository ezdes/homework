import java.util.Random;

public class Team2 implements Runnable {
    private String name;
    private Game game;

    public Team2() {

    }

    public Team2(String name, Game game) {
        this.name = name;
        this.game = game;
    }

    @Override
    public void run() {
        Random random = new Random();
        game.setBallCount2(random.nextInt(16));
        game.setYellowCards2(random.nextInt(16));
        game.setOffsideCount2(random.nextInt(16));
        System.out.println(name + " scored " + game.getBallCount2() + " goals.");
        System.out.println(name + " got " + game.getYellowCards2() + " yellow cards.");
        System.out.println(name + " was caught offside " + game.getOffsideCount2() + " times.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
