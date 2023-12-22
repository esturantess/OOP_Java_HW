package ru.gb.oseminar.data;

import java.time.LocalDate;

public class StudentComparator extends Student implements Comparable<Student>{

    public StudentComparator(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public StudentComparator(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth, studentId);
    }

    @Override
    public int compareTo(Student o) {
        return this.getStudentId().compareTo(o.getStudentId());
    }
}
