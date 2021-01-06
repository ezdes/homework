public class Monkey implements Climbable {

    private String name;
    private Climbable climbableAnimal;
    private Edible edible;

    public Monkey(String name, Banana banana, Cat cat){
        this.name = name;
        climbableAnimal = cat;
        edible = banana;
    }

    public void hold(){
        System.out.println(name + " is holding " + climbableAnimal.info());
    }

    @Override
    public void climb() {
        System.out.println(name + " is climbing.");
    }

    @Override
    public String info() {
        return name;
    }

    public void eat(){
        System.out.println(name + " is eating " + edible.info());
    }
}
