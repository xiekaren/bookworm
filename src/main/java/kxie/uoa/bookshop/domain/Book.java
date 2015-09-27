package kxie.uoa.bookshop.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Bean class to represent a Book product.
 * 
 * @author Karen Xie, kxie094
 *
 */
public class Book {
	@Id
	@Column(name="BOOK_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long _id;
	
	@Column(name="TITLE")
	private String _title;
	
	@Column(name="AUTHOR")
	private String _author;
	
	@Column(name="GENRE")
	private String _genre;
	
	@Column(name="PRICE")
	private double _price;
	
	private Review _review;

	public Long getId() {
		return _id;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getAuthor() {
		return _author;
	}

	public void setAuthor(String author) {
		_author = author;
	}
	
	public double getPrice() {
		return _price;
	}
	
	public void setPrice(double price) {
		_price = price;
	}

	public Review getReview() {
		return _review;
	}

	public void setReview(Review review) {
		_review = review;
	}

	public String getGenre() {
		return _genre;
	}

	public void setGenre(String genre) {
		_genre = genre;
	}
}