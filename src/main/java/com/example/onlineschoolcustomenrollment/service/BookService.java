package com.example.onlineschoolcustomenrollment.service;

import com.example.onlineschoolcustomenrollment.models.Book;
import com.example.onlineschoolcustomenrollment.models.Student;
import com.example.onlineschoolcustomenrollment.repo.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void add(Book book){
        bookRepo.save(book);
    }

    public List<Book> getAll(){
        return bookRepo.findAll();
    }

    public void delete(Long id){
        bookRepo.deleteById(id);
    }
}
