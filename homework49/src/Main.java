public class Main {

    public static int number = 10;

    public static void main(String[] args) throws InterruptedException {

        System.out.println(number);

        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread2 thread2 = new Thread2();
        thread2.start();

        Thread3 thread3 = new Thread3();
        thread3.start();

        Thread4 thread4 = new Thread4();
        thread4.start();

        Thread.sleep(2500);
        System.out.println(number);
    }
}

class Thread1 extends Thread {

    @Override
    public void run() {
        Main.number += 2;
    }
}

class Thread2 extends Thread {

    @Override
    public void run() {
        Main.number *= 2;
    }
}

class Thread3 extends Thread{

    @Override
    public void run() {
        Main.number /= 2;
    }
}

class Thread4 extends Thread {

    @Override
    public void run() {
        Main.number -= 2;
    }
}

