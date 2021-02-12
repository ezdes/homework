package TaskB;

public class Person {
    private int personId;
    private String personName;
    private String birthDate;

    public Person(){}

    public Person(int personId, String personName, String birthDate) {
        this.personId = personId;
        this.personName = personName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return personId + " " + personName + " " + birthDate;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
