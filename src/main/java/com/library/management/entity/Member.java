package com.library.management.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "memberId")
	int memberId;
	String firstName;
	String lastName;
	String gender;
	String status;
	@OneToMany(
        mappedBy = "member",
        cascade = CascadeType.ALL
    )
	List<Book> books;

	 public Member(int memberId, String firstName, String lastName, String gender, String status, List<Book> books) {
			super();
			this.memberId = memberId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.status = status;
			this.books = books;
		}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", status=" + status + ", books=" + books + "]";
	}


	 
}
