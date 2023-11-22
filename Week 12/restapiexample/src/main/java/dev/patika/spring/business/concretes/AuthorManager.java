package dev.patika.spring.business.concretes;

import dev.patika.spring.business.abstracts.IAuthorService;
import dev.patika.spring.business.requests.AddAuthorRequest;
import dev.patika.spring.business.requests.UpdateAuthorRequest;
import dev.patika.spring.business.responses.GetAllAuthorResponse;
import dev.patika.spring.core.mappers.ModelMapperService;
import dev.patika.spring.dal.abstracts.IAuthorRepository;
import dev.patika.spring.entity.Author;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AuthorManager implements IAuthorService {

    @Autowired
    private IAuthorRepository authorRepository;
    @Autowired
    private ModelMapperService modelMapper;

    @Override
    public List<GetAllAuthorResponse> findAll() {

        return authorRepository.findAll()
                .stream()
                .map(author -> modelMapper.forResponse().map(author, GetAllAuthorResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public GetAllAuthorResponse getByID(int id) {
        return modelMapper.forResponse()
                .map(authorRepository.findById(id),GetAllAuthorResponse.class);
    }

    @Override
    public Author save(AddAuthorRequest author) {
        return authorRepository.save(modelMapper.forRequest().map(author,Author.class));
    }

    @Override
    public Author update(UpdateAuthorRequest author) {
        return authorRepository.save(modelMapper.forRequest().map(author,Author.class));
    }

    @Override
    public void delete(int id) {
        authorRepository.deleteById(id);
    }
}
