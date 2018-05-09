package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reader;
	private String isbn;
	private String title;
	private String author;
	private String description;
	
	//
	public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getReader() {
			return reader;
		}
		public void setReader(String reader) {
			this.reader = reader;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
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
		
	
}
