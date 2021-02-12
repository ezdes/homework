package TaskA;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<City> list1 = new ArrayList<>();
        List<City> list2 = new ArrayList<>();

        list1.add(new City(1, "Pishpek"));
        list1.add(new City(2, "Osh"));
        list1.add(new City(3, "Karakol"));
        list1.add(new City(4, "Batken"));
        list1.add(new City(5, "Kant"));

        list2.add(new City(1, "Bishkek"));
        list2.add(new City(6, "Talas"));
        list2.add(new City(7, "Naryn"));
        list2.add(new City(3, "Cholpon-Ata"));
        list2.add(new City(5, "Tokmok"));

        CityDb.addToList(list1);
        CityDb.addToList(list2);
    }
}
