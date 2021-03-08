package com.company;

public class DaysOfTheWeek {
    private String name;

    public DaysOfTheWeek() {

    }

    public DaysOfTheWeek(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        DaysOfTheWeek d = (DaysOfTheWeek) obj;

        return d.getName().equals(name);

    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return name;
    }
}
