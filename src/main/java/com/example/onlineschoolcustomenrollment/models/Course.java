package com.example.onlineschoolcustomenrollment.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "Course")
@Table(name = "course")
public class Course {

    @Id
    @SequenceGenerator(name = "course_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
    private Long id;

    @NotEmpty
    @Column(name = "name", columnDefinition = "varchar(50)")
    private String name;

    @Column(name = "department", columnDefinition = "varchar(50)")
    private String department;

    //<--
    @OneToMany(mappedBy = "course")
    @JsonManagedReference
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<EnrolledCourses> enrolledCourses = new ArrayList<>();
    //-->

    public Course(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString(){
        String text = "";
        text += "{id:" + id + "\n";
        text += "name:" + name + "\n";
        text += "department:" + department + "}";

        return text;
    }
}
