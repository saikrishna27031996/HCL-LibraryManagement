package com.library.management.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bookId;
	String bookTitle;
	String author;
	Date dueDate;
	Date issueDate;
	Date returnDate;
	String status;
	@ManyToOne(fetch = FetchType.LAZY,
			targetEntity = Member.class)
	Member member;
	public Book(int bookId, String bookTitle, String author, Date dueDate, Date issueDate, Date returnDate,
			String status, Member member) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
		this.dueDate = dueDate;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.status = status;
		this.member = member;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", dueDate=" + dueDate
				+ ", issueDate=" + issueDate + ", returnDate=" + returnDate + ", status=" + status + ", member="
				+ member + "]";
	}
	
	
	
	
	
}
