import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Dog> dogs = new HashSet<>();

        for (int i = 0; i < 40; i++){
            dogs.add(new Dog("Dog" + i, i + 20));
        }
    }
}
