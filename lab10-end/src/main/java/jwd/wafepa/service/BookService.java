package jwd.wafepa.service;

import org.springframework.data.domain.Page;

import jwd.wafepa.model.Book;

public interface BookService {

	public Book save(Book book);

	public Page<Book> findAll(int page);

	public Page<Book> findAllBetween(double priceFrom, double priceTo, int page);
}
