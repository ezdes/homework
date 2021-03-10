import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<City> cities = new ArrayList<>();
        String[] names = {"Bishkek", "Oslo", "London", "Lion", "Talas", "Osh", "Rome", "Sydney", "Lagos", "Madrid"};

        for (int i = 0; i < 10; i++) {
            cities.add(new City(names[i], random.nextInt((1000000 - 100000) + 1) + 100000, i));
        }

        System.out.println("Cities in arraylist:");
        System.out.println(cities);

        Set<City> cities1 = new HashSet<>();
        Set<City> cities2 = new TreeSet<>(new CityDesc());

        for (City city : cities) {
            if (city.getCode() % 2 == 0) cities1.add(city);

            else cities2.add(city);
        }

        System.out.println();
        System.out.println("Cities in hashset:");
        System.out.println(cities1);
        System.out.println();
        System.out.println("Cities in treeset desc:");
        System.out.println(cities2);

        cities2.removeIf(city -> city.getName().length() > 5);
        Set<City> cities3 = new TreeSet<>(new CityAsc());
        cities3.addAll(cities2);
        System.out.println();
        System.out.println("Cities in treeset asc:");
        System.out.println(cities3);
    }
}
