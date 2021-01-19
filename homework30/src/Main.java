import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        ArrayList<Cat> arrayList = new ArrayList<>();
        LinkedList<Cat> linkedList = new LinkedList<>();

        Random randomAges = new Random();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(new Cat("Cat", randomAges.nextInt(10) + 1));
            linkedList.add(new Cat("Cat", randomAges.nextInt(10) + 1));
        }

        //adding 100 elements to ArrayList mid
        long startArrayList1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.add(arrayList.size() / 2, new Cat("Cat", randomAges.nextInt(10) + 1));
        }
        long endArrayList1 = System.currentTimeMillis();
        System.out.println("ArrayList mid adding time: " + (endArrayList1 - startArrayList1));

        //adding 100 elements to LinkedList mid
        long startLinkedList1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.add(linkedList.size() / 2, new Cat("Cat", randomAges.nextInt(10) + 1));
        }
        long endLinkedList1 = System.currentTimeMillis();
        System.out.println("LinkedList mid adding time: " + (endLinkedList1 - startLinkedList1));
        System.out.println();

        //adding 100 elements to ArrayList beginning
        long startArrayList2 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i, new Cat("Cat", randomAges.nextInt(10) + 1));
        }
        long endArrayList2 = System.currentTimeMillis();
        System.out.println("ArrayList beginning adding time: " + (endArrayList2 - startArrayList2));

        //adding 100 elements to LinkedList beginning
        long startLinkedList2 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.add(i, new Cat("Cat", randomAges.nextInt(10) + 1));
        }
        long endLinkedList2 = System.currentTimeMillis();
        System.out.println("LinkedList beginning adding time: " + (endLinkedList2 - startLinkedList2));
        System.out.println();

        //adding 100 elements to ArrayList end
        long startArrayList3 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.add(new Cat("Cat", randomAges.nextInt(10) + 1));
        }
        long endArrayList3 = System.currentTimeMillis();
        System.out.println("ArrayList end adding time: " + (endArrayList3 - startArrayList3));

        //adding 100 elements to LinkedList end
        long startLinkedList3 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.add(new Cat("Cat", randomAges.nextInt(10) + 1));
        }
        long endLinkedList3 = System.currentTimeMillis();
        System.out.println("LinkedList end adding time: " + (endLinkedList3 - startLinkedList3));
        System.out.println();

        //getting elements from Arraylist mid
        long startArrayList4 = System.currentTimeMillis();
        for (int i = arrayList.size() / 2; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        long endArrayList4 = System.currentTimeMillis();
        System.out.println("ArrayList getting elements from mid time: " + (endArrayList4 - startArrayList4));

        //getting elements from LinkedList mid
        long startLinkedList4 = System.currentTimeMillis();
        for (int i = linkedList.size() / 2; i < linkedList.size(); i++) {
            linkedList.get(i); // будет считывать 10+ мин
        }
        long endLinkedList4 = System.currentTimeMillis();
        System.out.println("LinkedList getting elements from mid time: " + (endLinkedList4 - startLinkedList4));
        System.out.println();

        //deleting elements from ArrayList mid
        long startArrayList5 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        long endArrayList5 = System.currentTimeMillis();
        System.out.println("ArrayList removing elements from mid time: " + (endArrayList5 - startArrayList5));

        //deleting elements from LinkedList mid
        long startLinkedList5 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        long endLinkedList5 = System.currentTimeMillis();
        System.out.println("LinkedList removing elements from mid time: " + (endLinkedList5 - startLinkedList5));
        System.out.println();

        //deleting elements from ArrayList beginning
        long startArrayList6 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.remove(i);
        }
        long endArrayList6 = System.currentTimeMillis();
        System.out.println("ArrayList removing elements from beginning time: " + (endArrayList6 - startArrayList6));

        //deleting elements from LinkedList beginning
        long startLinkedList6 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.remove(i);
        }
        long endLinkedList6 = System.currentTimeMillis();
        System.out.println("LinkedList removing elements from beginning time: " + (endLinkedList6 - startLinkedList6));
        System.out.println();
    }

    private static void task2() {
        LinkedList<Animal> linkedList = new LinkedList<>();

        //Создать по 50 кошек и собак, с возрастом, идущим на увеличение
        for (int i = 0; i < 50; i++) {
            linkedList.add(new Cat("Cat", i + 1));
            linkedList.add(new Dog("Dog", i + 1));
        }

        System.out.println("Created array: ");
        System.out.println(linkedList);
        System.out.println();

        //Удалить из списка каждую 5 кошку
        int counterCat = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) instanceof Cat) {
                counterCat++;

                if (counterCat == 5) {
                    linkedList.remove(i);
                    counterCat = 0;
                    i--;
                }
            }
        }

        System.out.println("Removed every 5 cat: ");
        System.out.println(linkedList);
        System.out.println();

        //Вставить после каждой 3 собаки – одну мышку.
        int countDog = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) instanceof Dog) {
                countDog++;

                if (countDog == 3) {
                    linkedList.add(i + 1, new Mouse("Mouse", i));
                    countDog = 0;
                }
            }
        }

        System.out.println("Added mouse after every 3 dog: ");
        System.out.println(linkedList);
        System.out.println();

        //Найти оказавшихся рядом кошек и мышек, переместить их в новый LinkedList.
        LinkedList<Animal> newLinkedList = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) instanceof Cat && linkedList.get(i + 1) instanceof Mouse ||
                    linkedList.get(i) instanceof Mouse && linkedList.get(i + 1) instanceof Cat) {
                newLinkedList.add(linkedList.get(i));
                newLinkedList.add(linkedList.get(i + 1));
            }
        }

        System.out.println("Added to new list near cats and mouse");
        System.out.println(newLinkedList);
        System.out.println();

        //Скопировать весь список из пункта 4 в ArrayList.
        ArrayList<Animal> animals = new ArrayList<>(linkedList);

        //Получить сумму возрастов отдельно по мышкам, кошкам и собакам.
        int dogAges = 0;
        int catAges = 0;
        int mouseAges = 0;

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogAges += animal.getAge();
            }

            if (animal instanceof Cat) {
                catAges += animal.getAge();
            }

            if (animal instanceof Mouse) {
                mouseAges += animal.getAge();
            }
        }

        System.out.println("Sum of ages: ");
        System.out.println(dogAges + " " + catAges + " " + mouseAges);
        System.out.println();

        //Нужно распределить элементы в новый LinkedList так, чтобы в посередине были собаки, вначале кошки, а в хвосте мыши (чтобы не было конфликта мышей и кошек)
        LinkedList<Animal> linkedList1 = new LinkedList<>();

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                linkedList1.add(animal);
            }
        }

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                linkedList1.add(animal);
            }
        }

        for (Animal animal : animals) {
            if (animal instanceof Mouse) {
                linkedList1.add(animal);
            }
        }

        System.out.println("Sorted: ");
        System.out.println(linkedList1);
    }
}
