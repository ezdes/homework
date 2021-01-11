public class Shark implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Shark is swimming...");
    }

    public void kill(){
        System.out.println("Shark is killing...");
    }
}
