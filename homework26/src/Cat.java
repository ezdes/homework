public class Cat implements Runnable {
    @Override
    public void run() {
        System.out.println("Cat is running...");
    }

    public void sing(){
        System.out.println("Cat is singing...");
    }
}
