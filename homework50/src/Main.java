public class Main {

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        Team1 team1 = new Team1("Chelsea", game);
        Team2 team2 = new Team2("PSG", game);
        Thread thread1 = new Thread(team1);
        Thread thread2 = new Thread(team2);

        thread1.start();
        thread2.start();
        Thread.sleep(1000);

        System.out.println(team1.getGame().getBallCount1() != team2.getGame().getBallCount2() ?
                team1.getGame().getBallCount1() > team2.getGame().getBallCount2() ? team1.getName() + " won!"
                        : team2.getName() + " won!" : "Draw!");
    }
}
