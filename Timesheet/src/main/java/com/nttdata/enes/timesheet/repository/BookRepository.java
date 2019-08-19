package com.nttdata.enes.timesheet.repository;

import org.springframework.data.repository.CrudRepository;

import com.nttdata.enes.timesheet.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);

}
