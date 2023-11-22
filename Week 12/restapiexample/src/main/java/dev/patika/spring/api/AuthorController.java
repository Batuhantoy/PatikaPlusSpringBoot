package dev.patika.spring.api;

import dev.patika.spring.business.abstracts.IAuthorService;
import dev.patika.spring.business.requests.AddAuthorRequest;
import dev.patika.spring.business.requests.UpdateAuthorRequest;
import dev.patika.spring.business.responses.GetAllAuthorResponse;
import dev.patika.spring.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/author")
public class AuthorController {

    @Autowired
    private IAuthorService authorService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllAuthorResponse> findAll(){
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetAllAuthorResponse getByID(@PathVariable("id") int id){
        return authorService.getByID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody AddAuthorRequest request){
        authorService.save(request);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Author update(@RequestBody UpdateAuthorRequest request){
        return authorService.update(request);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        authorService.delete(id);
    }





}
