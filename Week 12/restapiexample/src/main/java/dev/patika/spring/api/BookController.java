package dev.patika.spring.api;

import dev.patika.spring.business.abstracts.IAuthorService;
import dev.patika.spring.business.abstracts.IBookService;
import dev.patika.spring.business.requests.AddAuthorRequest;
import dev.patika.spring.business.requests.AddBookRequest;
import dev.patika.spring.business.requests.UpdateAuthorRequest;
import dev.patika.spring.business.requests.UpdateBookRequest;
import dev.patika.spring.business.responses.GetAllAuthorResponse;
import dev.patika.spring.business.responses.GetAllBookResponse;
import dev.patika.spring.entity.Author;
import dev.patika.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllBookResponse> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetAllBookResponse getByID(@PathVariable("id") int id){
        return bookService.getByID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody AddBookRequest request){
        bookService.save(request);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Book update(@RequestBody UpdateBookRequest request){
        return bookService.update(request);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        bookService.delete(id);
    }
}
