public class Main {

    public static void main(String[] args) {

        Monkey monkey = new Monkey("Monkey", new Banana("banana"), new Cat("cat"));
        monkey.climb();
        monkey.eat();
        monkey.hold();
    }
}
