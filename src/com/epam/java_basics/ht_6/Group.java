package com.epam.java_basics.ht_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {

    public String groupNumber;
    private ArrayList<Student> students;

    public Group(ArrayList<Student> students) {
        this.students = students;
    }

    public Group(String groupNumber, ArrayList<Student> students) {
        this(students);
        this.groupNumber = groupNumber;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public double getAverageScore() {
        double groupTotalAverageScore = 0;

        for (Student student : students) {
            groupTotalAverageScore += student.getAverageScore();
        }

        return groupTotalAverageScore / students.size();
    }

    public int getNumberOfExcellentStudents() {

        List<Integer> excellentMarks = Arrays.asList(Mark.NINE.getValue(), Mark.TEN.getValue());
        ArrayList<Integer> studentMarks;
        int numberOfExcellentStudents = 0;

        for (Student student : students) {
            studentMarks = student.getListOfMarks();

            if (!studentMarks.retainAll(excellentMarks)) {
                numberOfExcellentStudents++;
            }
        }
        return numberOfExcellentStudents;
    }

    public int getNumberOsStudentsWithAMark(Mark mark) {

        int numberOfStudentsWithAMark = 0;
        ArrayList<Integer> studentMarks;

        for (Student student : students) {
            studentMarks = student.getListOfMarks();
            if (studentMarks.contains(Integer.valueOf(mark.getValue()))) {
                numberOfStudentsWithAMark++;
            }
        }
        return numberOfStudentsWithAMark;
    }
}
