package com.example.onlineschoolcustomenrollment.service;

import com.example.onlineschoolcustomenrollment.models.Student;
import com.example.onlineschoolcustomenrollment.repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void add(Student student){
        studentRepo.save(student);
    }

    public List<Student> getAll(){
        return studentRepo.findAll();
    }

    public void delete(Long id){
        studentRepo.deleteById(id);
    }

    public Student getStudentById(Long id){
        return studentRepo.findById(id).get();
    }
}
