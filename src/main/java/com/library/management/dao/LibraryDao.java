package com.library.management.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.library.management.entity.Member;

public interface LibraryDao extends JpaRepository<Member, Integer>{
	
@Query("SELECT m FROM Member m WHERE m.memberId = ?1 and m.memberId = ?2")
	public List<Member> borrowBook(int memberId, int bookId);



}
