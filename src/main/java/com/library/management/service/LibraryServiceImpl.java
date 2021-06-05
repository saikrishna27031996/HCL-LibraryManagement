package com.library.management.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.management.dao.BookDao;
import com.library.management.dao.LibraryDao;
@Service
public class LibraryServiceImpl implements ILibraryService{

	@Autowired
	LibraryDao libraryDao;
	@Autowired
	BookDao bookDao;
	
@Transactional
	public String borrowBook(int memberId, int bookId) {
	if(bookDao.getCountOfBooksById(memberId)>= 3 || bookDao.getStatusById(bookId) != "AVAILABLE" ) {
		
	}
	
		libraryDao.borrowBook(memberId, bookId);
		
		return null;
	}


}
