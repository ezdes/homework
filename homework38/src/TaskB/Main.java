package TaskB;

public class Main {

    public static void main(String[] args) {
        PersonDb.insertPerson(1, "Ermek", "22/07/2004");
        PersonDb.insertPerson(2, "Azamat", "21/09/2004");
        PersonDb.insertPerson(3, "Naruto", "11/03/1997");
        PersonDb.insertPerson(4, "Kenpachi", "14/01/1985");
        PersonDb.insertPerson(5, "Bob", "30/12/1990");
        PersonDb.insertPerson(6, "Violetta", "13/02/2004");

        CountryDb.insertCountry(1, "Russia", "123", 1234, 4);
        CountryDb.insertCountry(2, "China", "321", 4321, 3);

        System.out.println(CountryDb.addToList());

        CityDb.insertCity(1, "Moscow", 1, 1, 6765);
        CityDb.insertCity(2, "Omsk", 1, 2, 2345);
        CityDb.insertCity(3, "Beijing", 2, 5, 9092);
        CityDb.insertCity(4, "Shanghai", 2, 6, 9878);

        System.out.println(CityDb.addToList());
    }
}
