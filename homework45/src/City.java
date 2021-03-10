
public class City  {
    private String name;
    private int population;
    private int code;

    public City() {}

    public City(String name, int population, int code) {
        this.name = name;
        this.population = population;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return name + " " + population + " " + code;
    }

}
