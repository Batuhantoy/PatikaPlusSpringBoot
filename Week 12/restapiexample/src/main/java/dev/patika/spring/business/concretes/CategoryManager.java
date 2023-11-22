package dev.patika.spring.business.concretes;

import dev.patika.spring.business.abstracts.ICategoryService;
import dev.patika.spring.business.requests.AddCategoryRequest;
import dev.patika.spring.business.requests.UpdateCategoryRequest;
import dev.patika.spring.business.responses.GetAllAuthorResponse;
import dev.patika.spring.business.responses.GetAllCategoryResponse;
import dev.patika.spring.core.mappers.ModelMapperService;
import dev.patika.spring.dal.abstracts.ICategoryRepository;
import dev.patika.spring.entity.Author;
import dev.patika.spring.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryManager implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    @Autowired
    private ModelMapperService modelMapper;


    @Override
    public List<GetAllCategoryResponse> findAll() {
        return categoryRepository.findAll()
                .stream()
                .map(author -> modelMapper.forResponse().map(author, GetAllCategoryResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public GetAllCategoryResponse getByID(int id) {
        return modelMapper.forResponse()
                .map(categoryRepository.findById(id),GetAllCategoryResponse.class);
    }

    @Override
    public Category save(AddCategoryRequest category) {
        return categoryRepository.save(modelMapper.forRequest().map(category, Category.class));
    }

    @Override
    public Category update(UpdateCategoryRequest category) {
        return categoryRepository.save(modelMapper.forRequest().map(category, Category.class));
    }

    @Override
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }
}
