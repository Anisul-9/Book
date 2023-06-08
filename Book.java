package com.bookauthor;

public class Book {
	
	private String name;
	private String genre;
	private double price;
	private Author author;
	
	
	public Book(String name, String genre,double price) {
		this.name=name;
		this.genre=genre;
		this.price=price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
	public void  printBookDetails() {
		System.out.println("Book");
		System.out.println("name");
		System.out.println("genre");
		System.out.println("price");
		
		if(author!=null) {
			author.printAuthordetails();
		}
		else {
			System.out.println("Author details has not been disclosed");
		}
		
		
	}
	

}
