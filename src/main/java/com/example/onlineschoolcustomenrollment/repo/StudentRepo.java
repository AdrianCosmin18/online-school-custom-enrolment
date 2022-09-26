package com.example.onlineschoolcustomenrollment.repo;

import com.example.onlineschoolcustomenrollment.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}
