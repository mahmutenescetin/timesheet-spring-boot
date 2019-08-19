package com.nttdata.enes.timesheet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.enes.timesheet.model.Book;
import com.nttdata.enes.timesheet.repository.BookRepository;

@Service
public class TimeSheetService {
	
	@Autowired
	BookRepository bookRepository;

	public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }
	
	public Book getBookById(long ıd) {
        return  bookRepository.findById(ıd).orElse(null);
    }
}
