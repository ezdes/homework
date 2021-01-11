public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying...");
    }

    public void arrive(){
        System.out.println("Airplane is arriving...");
    }
}
