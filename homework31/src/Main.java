
import java.util.*;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {

        // didn't use method overloading!
        arrayListSort1();
        arrayListSort2();
        arrayListSort3(); // selection sort

        separate();

        // знаю что код дублируется много раз (это просто, чтобы сделать код более понятным)

        linkedListSort1();
        linkedListSort2();
        linkedListSort3(); // selection sort

        separate();

        arraySort1();
        arraySort2(); // selection sort
        arraySort3(); // bubble sort
    }

    private static void arrayListSort1() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(2));
        }

        System.out.println("Before: ");
        System.out.println(list);
        Collections.sort(list);

        System.out.println("After: ");
        System.out.println(list);
        System.out.println();
    }

    private static void arrayListSort2() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(2));
        }

        System.out.println("Before: ");
        System.out.println(list);

        ComparatorList cl = new ComparatorList();
        list.sort(cl);
        System.out.println("After: ");
        System.out.println(list);
        System.out.println();
    }

    private static void arrayListSort3() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(2));
        }

        System.out.println("Before: ");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            int minId = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minId = j;
                }
            }
            int temp = list.get(i);
            list.set(i, min);
            list.set(minId, temp);
        }

        System.out.println("After: ");
        System.out.println(list);
        System.out.println();
    }

    private static void linkedListSort1() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(2));
        }

        System.out.println("Before: ");
        System.out.println(list);
        Collections.sort(list);

        System.out.println("After: ");
        System.out.println(list);
        System.out.println();
    }

    private static void linkedListSort2() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(2));
        }

        System.out.println("Before: ");
        System.out.println(list);

        ComparatorList ls = new ComparatorList();
        list.sort(ls);

        System.out.println("After: ");
        System.out.println(list);
        System.out.println();
    }

    private static void linkedListSort3() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(2));
        }

        System.out.println("Before: ");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            int minId = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minId = j;
                }
            }
            int temp = list.get(i);
            list.set(i, min);
            list.set(minId, temp);
        }

        System.out.println("After: ");
        System.out.println(list);
        System.out.println();
    }

    private static void arraySort1() {
        int[] array = new int[20];

        System.out.println("Before: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);

            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);

        System.out.println("\nAfter: ");

        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }

    private static void arraySort2() {
        int[] array = new int[20];

        System.out.println("Before: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);

            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }

        System.out.println("\nAfter: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }

    private static void arraySort3() {
        int[] array = new int[20];

        System.out.println("Before: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);

            System.out.print(array[i] + " ");
        }

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println("\nAfter: ");
        for (int values : array) {
            System.out.print(values + " ");
        }
    }

    private static void separate() {
        System.out.print("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
