package jwd.wafepa.support;

import jwd.wafepa.model.Author;
import jwd.wafepa.web.dto.AuthorDTO;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AuthorDTOToAuthor implements Converter<AuthorDTO, Author>{

	@Override
	public Author convert(AuthorDTO authorDTO) {
		// TODO dodati da se lista knjiga preuzima iz baze kroz servis
		Author author = new Author(authorDTO.getId(), authorDTO.getFirstName(), authorDTO.getLastName(), null);
		return author;
	}

}
