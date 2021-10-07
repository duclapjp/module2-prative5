package controller;

import model.HouseHold;
import model.People;

import java.util.ArrayList;

public class Town {
    private People people;
    private HouseHold houseHold;
    ArrayList<HouseHold> houseHoldList = new ArrayList<>();

    public Town() {
    }

    public HouseHold getHouseHold() {
        return houseHold;
    }

    public void setHouseHold(HouseHold houseHold) {
        this.houseHold = houseHold;
    }

    public ArrayList<HouseHold> getHouseHoldList() {
        return houseHoldList;
    }

    public void setHouseHoldList(ArrayList<HouseHold> houseHoldList) {
        this.houseHoldList = houseHoldList;
    }

    public void addNewHouseHold(HouseHold houseHold) {
        houseHoldList.add(houseHold);
    }

    public int getHouseHold(String numhouse) {
        int index = 0;
        for (int i = 0; i < houseHoldList.size(); i++) {
            if (houseHoldList.get(i).getNumHouse().equals(numhouse)) {
                index = i;
            }
        }
        return index;
    }

    public void editHouseHold(String numhouse, HouseHold houseHold) {
        int index = getHouseHold(numhouse);
        houseHoldList.set(index, houseHold);
    }

    public HouseHold seachHouseHold(String numHouse) {
        for (int i = 0; i < houseHoldList.size(); i++) {
            if (houseHoldList.get(i).getNumHouse().equals(numHouse)) {
                return houseHoldList.get(i);
            }
        }
        return null;
    }

    public void deleteHouseHold(String numHouse) {
        int index = getHouseHold(numHouse);
        houseHoldList.remove(index);
    }

    public void showAllHouseHold() {
        for (HouseHold h : houseHoldList) {
            System.out.println(h.toString());
        }
    }

    @Override
    public String toString() {
        return "Town{" +
                "Hộ dân" + houseHoldList +
                '}';
    }
}
