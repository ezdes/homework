package TaskB;

public class City {
    private int cityId;
    private String cityName;
    private Country countryId;
    private Person mayorId;
    private int cityPopulation;

    public City(){}

    public City(int cityId, String cityName, Country countryId, Person mayorId, int cityPopulation) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.countryId = countryId;
        this.mayorId = mayorId;
        this.cityPopulation = cityPopulation;
    }

    @Override
    public String toString(){
        return "\nCity Id: " + cityId + "\nCity name: " + cityName + "\nMayor: " + mayorId + "\nCity population " + cityPopulation  + countryId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountryId() {
        return countryId;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }

    public Person getMayorId() {
        return mayorId;
    }

    public void setMayorId(Person mayorId) {
        this.mayorId = mayorId;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }
}
