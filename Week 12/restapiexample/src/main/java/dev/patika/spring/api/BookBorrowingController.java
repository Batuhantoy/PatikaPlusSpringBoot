package dev.patika.spring.api;

import dev.patika.spring.business.abstracts.IAuthorService;
import dev.patika.spring.business.abstracts.IBookBorrowingService;
import dev.patika.spring.business.requests.AddAuthorRequest;
import dev.patika.spring.business.requests.AddBorrowingRequest;
import dev.patika.spring.business.requests.UpdateAuthorRequest;
import dev.patika.spring.business.requests.UpdateBorrowingRequest;
import dev.patika.spring.business.responses.GetAllAuthorResponse;
import dev.patika.spring.business.responses.GetAllBorrowingResponse;
import dev.patika.spring.entity.Author;
import dev.patika.spring.entity.BookBorrowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BookBorrowingController {
    @Autowired
    private IBookBorrowingService borrowingService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllBorrowingResponse> findAll(){
        return borrowingService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetAllBorrowingResponse getByID(@PathVariable("id") int id){
        return borrowingService.getByID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody AddBorrowingRequest request){
        borrowingService.save(request);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public BookBorrowing update(@RequestBody UpdateBorrowingRequest request){
        return borrowingService.update(request);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        borrowingService.delete(id);
    }
}
