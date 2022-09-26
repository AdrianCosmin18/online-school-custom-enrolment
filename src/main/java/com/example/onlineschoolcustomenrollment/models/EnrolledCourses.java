package com.example.onlineschoolcustomenrollment.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Builder
@Table(name = "enrolled_courses")
@Entity(name = "EnrolledCourses")
public class EnrolledCourses {


    @EmbeddedId//facem o clasa care contine 2 id-uri
    private EnrolmentId id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id", foreignKey = @ForeignKey(name = "enrolment_student_id_fk"))
    private Student student;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id", foreignKey = @ForeignKey(name = "enrolment_course_id_fk"))
    private Course course;

    @Column(name = "created_at", nullable = false, columnDefinition = "varchar(50)")
    private LocalDate createdAt;


    public EnrolledCourses(EnrolmentId id,Student student, Course course, LocalDate createdAt) {
        this.id = id;
        this.student = student;
        this.course = course;
        this.createdAt = createdAt;
    }
}
