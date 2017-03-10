package jwd.wafepa.service;

import java.util.List;

import jwd.wafepa.model.Author;

public interface AuthorService {

	public Author save(Author author);
	
	public List<Author> findAll(); 
}
