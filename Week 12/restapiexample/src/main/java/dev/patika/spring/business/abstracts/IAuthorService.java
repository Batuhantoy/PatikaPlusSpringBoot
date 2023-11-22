package dev.patika.spring.business.abstracts;

import dev.patika.spring.business.requests.AddAuthorRequest;
import dev.patika.spring.business.requests.UpdateAuthorRequest;
import dev.patika.spring.business.responses.GetAllAuthorResponse;
import dev.patika.spring.entity.Author;

import java.util.List;

public interface IAuthorService {

    List<GetAllAuthorResponse> findAll();
    GetAllAuthorResponse getByID(int id);
    Author save(AddAuthorRequest author);
    Author update(UpdateAuthorRequest author);
    void delete(int id);
}
