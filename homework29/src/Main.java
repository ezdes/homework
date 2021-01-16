import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1(){
        System.out.println("Task1: ");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ветер с моря дул");
        list1.add("Ветер с моря дул");
        list1.add("Нагонял беду");
        list1.add("Нагонял беду");
        list1.add("И сказал ты мне");
        list1.add("И сказал ты мне");
        list1.add("Больше не приду");
        list1.add("Больше не приду");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();

        for (String s : list1) {
            if (s.length() >= 15)
                list2.add(s);
        }

        list2.removeIf(s -> s.equals("И сказал ты мне"));
        System.out.println(list2);
        System.out.println();
    }

    private static void task2(){
        System.out.println("Task2: ");

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listEven = new ArrayList<>();
        ArrayList<Integer> listOdd = new ArrayList<>();

        for (int i = 0; i < 50; i++){
            list.add(random.nextInt(100) + 1);

            if (list.get(i) % 2 == 0)
                listEven.add(list.get(i));

            else
                listOdd.add(list.get(i));
        }

        System.out.println(list);
        System.out.println(listEven);
        System.out.println(listOdd);
    }
}
