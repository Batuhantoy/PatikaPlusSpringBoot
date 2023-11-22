package dev.patika.spring.business.concretes;

import dev.patika.spring.business.abstracts.IBookService;
import dev.patika.spring.business.requests.AddBookRequest;
import dev.patika.spring.business.requests.UpdateBookRequest;
import dev.patika.spring.business.responses.GetAllBookResponse;
import dev.patika.spring.core.mappers.ModelMapperService;
import dev.patika.spring.dal.abstracts.IBookRepository;
import dev.patika.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookManager implements IBookService {

    @Autowired
    private IBookRepository bookRepository;
    @Autowired
    private ModelMapperService modelMapper;


    @Override
    public List<GetAllBookResponse> findAll() {
        return bookRepository.findAll()
                .stream()
                .map(book -> modelMapper.forResponse().map(book,GetAllBookResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public GetAllBookResponse getByID(int id) {
        return modelMapper.forResponse()
                .map(bookRepository.findById(id),GetAllBookResponse.class);
    }

    @Override
    public Book save(AddBookRequest book) {
        return bookRepository.save(modelMapper.forRequest().map(book,Book.class));
    }

    @Override
    public Book update(UpdateBookRequest book) {
        return bookRepository.save(modelMapper.forRequest().map(book,Book.class));
    }

    @Override
    public void delete(int id) {
        bookRepository.deleteById(id);
    }
}
