package com.example.onlineschoolcustomenrollment.repo;

import com.example.onlineschoolcustomenrollment.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
}
