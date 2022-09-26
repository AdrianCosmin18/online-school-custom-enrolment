package com.example.onlineschoolcustomenrollment;

import com.example.onlineschoolcustomenrollment.models.Book;
import com.example.onlineschoolcustomenrollment.models.Course;
import com.example.onlineschoolcustomenrollment.models.Student;
import com.example.onlineschoolcustomenrollment.service.BookService;
import com.example.onlineschoolcustomenrollment.service.CourseService;
import com.example.onlineschoolcustomenrollment.service.EnrolledCourseService;
import com.example.onlineschoolcustomenrollment.service.StudentService;
import com.github.javafaker.Faker;
import org.aspectj.weaver.bcel.FakeAnnotation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class OnlineSchoolAppMoreModelsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineSchoolAppMoreModelsApplication.class, args);
    }

    @Bean
    CommandLineRunner clr(StudentService studentService, BookService bookService, CourseService courseService, EnrolledCourseService enrolledCourseService){
        return args -> {

            Faker f = new Faker();
            //            for(int i=0; i<10; i++){
//
//                studentService.add(Student.builder().age(f.number().numberBetween(18,60))
//                                                    .email(f.name().fullName() + "@gmail.com")
//                                                    .firstName(f.name().firstName())
//                                                    .lastName(f.name().lastName()).build());
//
//                courseService.add(Course.builder().name(f.commerce().productName())
//                                                  .department(f.commerce().department()).build());
//
//
//            }

//            for(int i = 0; i<10; i++){
//
//                long nr = f.number().numberBetween(1L, 10L);
//                Student student = studentService.getStudentById(nr);
//                student.addBook(Book.builder().createdAt(LocalDate.now()).name(f.book().title()).build());
//                studentService.getStudentRepo().save(student);
//            }


            Student student = studentService.getStudentById(1L);
            Course course = courseService.getCourseById(1L);
            System.out.println(student);
            System.out.println(course);
            enrolledCourseService.enrol(student, course);

        };
    }
}
