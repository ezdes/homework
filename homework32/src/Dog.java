
public class Dog {
    private String name;
    private int weight;

    public Dog(){}

    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        int r = name.hashCode();
        r = 31 * r + weight;
        return r;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;

        if (o == null || o.getClass() != this.getClass()) return false;

        Dog dog = (Dog) o;

        return name.equals(dog.name) && weight == dog.weight;
    }

    @Override
    public String toString(){
        return name + " " + weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
