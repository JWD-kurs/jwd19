package jwd.wafepa.repository;

import jwd.wafepa.model.Book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository 
	extends PagingAndSortingRepository<Book, Long>{

	Page<Book> findByPriceGreaterThanAndPriceLessThan(double priceFrom, double priceTo, Pageable page);
}
