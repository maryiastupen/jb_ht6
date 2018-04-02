package com.epam.java_basics.ht_6;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    public String surname;
    public String group;
    private int historyMark;
    private int mathMark;
    private int programmingMark;

    public Student(String surname, String group) {
        this.surname = surname;
        this.group = group;
    }

    public void setHistoryMark(int historyMark) {
        this.historyMark = historyMark;
    }

    public void setMathMark(int mathMark) {
        this.mathMark = mathMark;
    }

    public void setProgrammingMark(int programmingMark) {
        this.programmingMark = programmingMark;
    }

    public double getAverageScore() {
        return (historyMark + mathMark + programmingMark) / 3;
    }

    public ArrayList<Integer> getListOfMarks() {
        return new ArrayList<>(Arrays.asList(historyMark, mathMark, programmingMark));
    }
}
