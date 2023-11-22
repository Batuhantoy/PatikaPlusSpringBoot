package dev.patika.spring.business.abstracts;

import dev.patika.spring.business.requests.AddBookRequest;
import dev.patika.spring.business.requests.UpdateBookRequest;
import dev.patika.spring.business.responses.GetAllBookResponse;
import dev.patika.spring.entity.Book;

import java.util.List;

public interface IBookService {

    List<GetAllBookResponse> findAll();
    GetAllBookResponse getByID(int id);
    Book save(AddBookRequest book);
    Book update(UpdateBookRequest book);
    void delete(int id);
}
