package com.example.onlineschoolcustomenrollment.service;

import com.example.onlineschoolcustomenrollment.models.Course;
import com.example.onlineschoolcustomenrollment.models.EnrolledCourses;
import com.example.onlineschoolcustomenrollment.models.EnrolmentId;
import com.example.onlineschoolcustomenrollment.models.Student;
import com.example.onlineschoolcustomenrollment.repo.EnrolledCoursesRepo;
import com.example.onlineschoolcustomenrollment.repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EnrolledCourseService {

    private EnrolledCoursesRepo enrolledCoursesRepo;
    private StudentRepo studentRepo;

    public EnrolledCourseService(EnrolledCoursesRepo enrolledCoursesRepo, StudentRepo studentRepo) {
        this.enrolledCoursesRepo = enrolledCoursesRepo;
        this.studentRepo = studentRepo;
    }

    public void enrol(Student student, Course course){

        student.addEnrollemnt(new EnrolledCourses(
                new EnrolmentId(student.getId(), course.getId()),
                student,
                course,
                LocalDate.now()
        ));
        studentRepo.save(student);
    }


}