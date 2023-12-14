package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{

    private List<Teacher> teacherList;
    private Long maxTeacherId = 0L;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, maxTeacherId++);
        teacherList.add(teacher);
    }


    public void initData(List<Teacher> list) {
        this.teacherList = list;
        maxTeacherId = getNewMaxTeacherId();
    }

    private Long getNewMaxTeacherId(){
        Long result = teacherList.get(0).getTeacherId();
        for (Teacher teacher: teacherList) {
            if (result < teacher.getTeacherId()){
                result = teacher.getTeacherId();
            }
        }
        return result;
    }
    public void editTeacher(Long teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        for (Teacher teacher: teacherList) {
            if (teacher.getTeacherId().equals(teacherId)){
                teacher.setFirstName(firstName);
                teacher.setSecondName(secondName);
                teacher.setPatronymic(patronymic);
                teacher.setDateOfBirth(dateOfBirth);
            }
        }
    }

}