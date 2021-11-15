package day01;

import java.util.ArrayList;

public class PositiveNumberContainer {

    private ArrayList<Double> positiveNumberList = new ArrayList<>();

    public void addNumbersToList(double number){
        positiveNumberList.add(number);
    }
    public ArrayList<Double> getPositiveNumberList() {
        return positiveNumberList;
    }
}
