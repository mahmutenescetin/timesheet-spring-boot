package com.nttdata.enes.timesheet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.enes.timesheet.model.Book;
import com.nttdata.enes.timesheet.service.TimeSheetService;


@RestController
public class TimeSheetController {
	
	@Autowired
	TimeSheetService timeSheetService;

	@GetMapping("/timesheets")
    public Iterable<Book> getAllBooks() {
        return timeSheetService.getAllBooks();
    }
	
	@GetMapping("/timesheet/{id}")
    public Book getBookById(@PathVariable(value = "id") Long id) {
        return timeSheetService.getBookById(id);
    }
}
