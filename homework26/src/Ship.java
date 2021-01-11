public class Ship implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Ship is swimming...");
    }

    public void sink(){
        System.out.println("Ship is sinking...");
    }
}
