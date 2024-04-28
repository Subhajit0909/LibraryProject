package com.project.library.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//Primary Key
	@Id
	@Column(name="ID")
	private long id;
	
	@Column(name="BOOK_TITLE")
	private String bookTitle;
	
	@Column(name="AUTHOR")
	private String author;
	
	//Optional field
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="RACK_NO")
	private String rackNo;
	
	@Column(name="BORROWED")
	private boolean borrowed;
	
	//Foreign Key
	@Column(name="MEMBER_ID")
	private long memberId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRackNo() {
		return rackNo;
	}

	public void setRackNo(String rackNo) {
		this.rackNo = rackNo;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	
}
