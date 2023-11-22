package dev.patika.spring.api;

import dev.patika.spring.business.abstracts.IBookService;
import dev.patika.spring.business.abstracts.ICategoryService;
import dev.patika.spring.business.requests.AddBookRequest;
import dev.patika.spring.business.requests.AddCategoryRequest;
import dev.patika.spring.business.requests.UpdateBookRequest;
import dev.patika.spring.business.requests.UpdateCategoryRequest;
import dev.patika.spring.business.responses.GetAllAuthorResponse;
import dev.patika.spring.business.responses.GetAllBookResponse;
import dev.patika.spring.business.responses.GetAllCategoryResponse;
import dev.patika.spring.entity.Book;
import dev.patika.spring.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllCategoryResponse> findAll(){
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetAllCategoryResponse getByID(@PathVariable("id") int id){
        return categoryService.getByID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody AddCategoryRequest request){
        categoryService.save(request);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Category update(@RequestBody UpdateCategoryRequest request){
        return categoryService.update(request);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        categoryService.delete(id);
    }

}
