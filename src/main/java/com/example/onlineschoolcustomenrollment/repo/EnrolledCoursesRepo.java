package com.example.onlineschoolcustomenrollment.repo;

import com.example.onlineschoolcustomenrollment.models.EnrolledCourses;
import com.example.onlineschoolcustomenrollment.models.EnrolmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolledCoursesRepo extends JpaRepository<EnrolledCourses, EnrolmentId> {
}
