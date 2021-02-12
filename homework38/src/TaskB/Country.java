package TaskB;

public class Country {
    private int countryId;
    private String countryName;
    private String code;
    private int countryPopulation;
    private Person presidentId;

    public Country(){}

    public Country(int countryId, String countryName, String code, int countryPopulation, Person presidentId) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.code = code;
        this.countryPopulation = countryPopulation;
        this.presidentId = presidentId;
    }

    @Override
    public String toString(){
        return "\nCountry id: " + countryId + "\nCountry name: " +  countryName + "\nCode: " + code + "\nCountry population: " + countryPopulation + "\nPresident: " + presidentId + "\n";
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public Person getPresidentId() {
        return presidentId;
    }

    public void setPresidentId(Person presidentId) {
        this.presidentId = presidentId;
    }
}
