package com.swp.schoolinfo.service;

import com.swp.schoolinfo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
    private List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
    }

    public Student add(Student student) {
        studentList.add(student);
        return student;
    }

    public Student remove(Student student) {
        studentList.remove(student);
        return student;
    }

    public Student search(Student student) {
        for (Student s : studentList) {
            if (s.equals(student)) {
                return s;
            }
        }
        throw new RuntimeException("Student not found");
    }

    public Student set(int index, Student newStudent) {
        studentList.set(index, newStudent);
        return studentList.get(index);
    }

    public List<Student> allStudents() {
        return studentList;
    }
}