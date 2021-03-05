import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Car> carHashMap = new HashMap<>();

        List<Car> cars = CarDb.getCar();
        for (Car car : cars) {
            carHashMap.put(car.getId(), car);
        }

        for(HashMap.Entry<Integer, Car> c : carHashMap.entrySet()){
            System.out.println(c);
        }
    }
}
