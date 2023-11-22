package dev.patika.spring.business.abstracts;

import dev.patika.spring.business.requests.AddBorrowingRequest;
import dev.patika.spring.business.requests.UpdateBorrowingRequest;
import dev.patika.spring.business.responses.GetAllBorrowingResponse;
import dev.patika.spring.entity.BookBorrowing;

import java.util.List;

public interface IBookBorrowingService {
    List<GetAllBorrowingResponse> findAll();
    GetAllBorrowingResponse getByID(int id);
    BookBorrowing save(AddBorrowingRequest borrowing);
    BookBorrowing update(UpdateBorrowingRequest borrowing);
    void delete(int id);
}
