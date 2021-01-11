public class Person implements Runnable {
    @Override
    public void run() {
        System.out.println("Person is running...");
    }

    public void playingPc(){
        System.out.println("Person is playing pc...");
    }
}
