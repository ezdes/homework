public class Parrot implements Flyable {
    @Override
    public void fly() {
        System.out.println("Parrot is flying...");
    }

    public void sleep(){
        System.out.println("Parrot is sleeping...");
    }
}
