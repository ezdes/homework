
public class Cat implements Climbable{

    private String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void climb() {
        System.out.println(name + " is climbing");
    }

    @Override
    public String info() {
        return name;
    }
}
