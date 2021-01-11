public class Main {

    public static void main(String[] args) {

        Flyable[] flyable = {new Airplane(), new Parrot()};
        Runnable[] runnable = {new Cat(), new Person()};
        Swimmable[] swimmable = {new Shark(), new Whale(), new Ship(), new Duck()};

        fly(flyable);
        run(runnable);
        swim(swimmable);
    }

    private static void fly(Flyable[] flyable) {
        flyable[0].fly();
        flyable[1].fly();
        ((Airplane) flyable[0]).arrive();
        ((Parrot) flyable[1]).sleep();
        System.out.println();
    }

    private static void run(Runnable[] runnable) {
        runnable[0].run();
        runnable[1].run();
        ((Cat) runnable[0]).sing();
        ((Person) runnable[1]).playingPc();
        System.out.println();
    }

    private static void swim(Swimmable[] swimmable) {
        swimmable[0].swim();
        swimmable[1].swim();
        swimmable[2].swim();
        swimmable[3].swim();
        ((Shark) swimmable[0]).kill();
        ((Whale) swimmable[1]).read();
        ((Ship) swimmable[2]).sink();
        ((Duck) swimmable[3]).dance();
    }
}
