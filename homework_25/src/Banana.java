public class Banana implements Edible {
    private String name;

    public Banana(String name){
        this.name = name;
    }

    @Override
    public String info() {
        return name;
    }
}
