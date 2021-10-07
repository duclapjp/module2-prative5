package model;

import java.util.ArrayList;

public class HouseHold {
    private String numHouse;
    private ArrayList<People> peoplelist = new ArrayList<>();

    public HouseHold() {
    }

    public HouseHold(String numHouse, ArrayList<People> peoplelist) {
        this.numHouse = numHouse;
        this.peoplelist = peoplelist;
    }

    public HouseHold(String numHouse) {
        this.numHouse = numHouse;
    }

    public HouseHold(String newNumHouse, HouseHold newPeople) {
    }

    public void addPeople(People people) {
        peoplelist.add(people);
    }

    public String getNumHouse() {
        return numHouse;
    }

    public void setNumHouse(String numHouse) {
        this.numHouse = numHouse;
    }

    public ArrayList<People> getPeoplelist() {
        return peoplelist;
    }

    public void setPeoplelist(ArrayList<People> peoplelist) {
        this.peoplelist = peoplelist;
    }

    @Override
    public String toString() {
        return "HouseHold{" +
                "numHouse='" + numHouse + '\'' +
                ", peoplelist=" + peoplelist +
                '}';
    }
}
