package com.epam.java_basics.ht_6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final String GROUP_NUMBER = "473901";
        ArrayList<Student> students = new ArrayList<>();

        enrollStudentInAGroup(students, "Ivanov", GROUP_NUMBER);
        enrollStudentInAGroup(students, "Petrov", GROUP_NUMBER);
        enrollStudentInAGroup(students, "Sergeev", GROUP_NUMBER);

        Group group = formAGroup(students);
        setMarks(group);
        printStatisticsPerGroup(group);
        printStatisticsPerEachStudentInAGroup(group);
    }

    public static Group formAGroup(ArrayList<Student> students) {
        return new Group(students);
    }

    public static void enrollStudentInAGroup(ArrayList<Student> students, String surname, String groupNumber) {
        students.add(new Student(surname, groupNumber));
    }

    public static void setMarks(Group group) {
        for (Student student : group.getStudents()) {
            student.setHistoryMark(Mark.getRandomMark().getValue());
            student.setMathMark(Mark.getRandomMark().getValue());
            student.setProgrammingMark(Mark.getRandomMark().getValue());
        }
    }

    public static void printStatisticsPerGroup(Group group) {
        System.out.println("Average score of a group is " + group.getAverageScore());
        System.out.println("Number of excellent students in a group " + group.getNumberOfExcellentStudents());
        System.out.println("Number of losers in a group " + group.getNumberOsStudentsWithAMark(Mark.TWO));
    }

    public static void printStatisticsPerEachStudentInAGroup(Group group) {
        for (Student student : group.getStudents()) {
            System.out.println("Average score of a student " + student.surname + " is " + student.getAverageScore());
        }
    }
}
