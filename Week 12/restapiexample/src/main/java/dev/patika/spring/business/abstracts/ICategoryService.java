package dev.patika.spring.business.abstracts;

import dev.patika.spring.business.requests.AddCategoryRequest;
import dev.patika.spring.business.requests.UpdateCategoryRequest;
import dev.patika.spring.business.responses.GetAllCategoryResponse;
import dev.patika.spring.entity.Book;
import dev.patika.spring.entity.Category;

import java.util.List;

public interface ICategoryService {

    List<GetAllCategoryResponse> findAll();
    GetAllCategoryResponse getByID(int id);
    Category save(AddCategoryRequest category);
    Category update(UpdateCategoryRequest category);
    void delete(int id);
}
