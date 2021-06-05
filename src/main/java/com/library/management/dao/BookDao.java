package com.library.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.library.management.entity.Book;


public interface BookDao extends JpaRepository<Book, Integer>{

@Query("SELECT count(b) FROM Book b where b.member.memberId = ?1")
public int getCountOfBooksById(int memberId);

@Query("SELECT status FROM Book b where bookId = ?1")
public String getStatusById(int bookId);





}
