package com.example.onlineschoolcustomenrollment.service;

import com.example.onlineschoolcustomenrollment.models.Course;
import com.example.onlineschoolcustomenrollment.models.Student;
import com.example.onlineschoolcustomenrollment.repo.CourseRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private CourseRepo courseRepo;

    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public void add(Course course){
        courseRepo.save(course);
    }

    public List<Course> getAll(){
        return courseRepo.findAll();
    }

    public void delete(Long id){
        courseRepo.deleteById(id);
    }

    public Course getCourseById(Long id){
        return courseRepo.findById(id).get();
    }
}
