package com.library.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.management.service.ILibraryService;


@RestController
@RequestMapping("/api")
public class LibraryController {
	@Autowired
	ILibraryService ilibraryService;
	
    
    @RequestMapping(value="/borrow", method=RequestMethod.PUT)
	public String borrowBook(@RequestParam int memberId, @RequestParam int bookId) {
    String status = 	ilibraryService.borrowBook(memberId, bookId);
    	return status;
    }

    
}
