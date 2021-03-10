import java.util.Comparator;

public class CityAsc implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        if (o1.getCode() == o2.getCode()) return 0;
        else if (o1.getCode() < o2.getCode()) return -1;
        return 1;
    }
}
