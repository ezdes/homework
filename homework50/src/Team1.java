import java.util.Random;

public class Team1 implements Runnable {
    private String name;
    private Game game;

    public Team1() {

    }

    public Team1(String name, Game game) {
        this.name = name;
        this.game = game;
    }

    @Override
    public void run() {
        Random random = new Random();
        game.setBallCount1(random.nextInt(16));
        game.setYellowCards1(random.nextInt(16));
        game.setOffsideCount1(random.nextInt(16));
        System.out.println(name + " scored " + game.getBallCount1() + " goals.");
        System.out.println(name + " got " + game.getYellowCards1() + " yellow cards.");
        System.out.println(name + " was caught offside " + game.getOffsideCount1() + " times.");
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
