package dev.patika.spring.business.concretes;

import dev.patika.spring.business.abstracts.IPublisherService;
import dev.patika.spring.business.requests.AddAuthorRequest;
import dev.patika.spring.business.requests.AddPublisherRequest;
import dev.patika.spring.business.requests.UpdateAuthorRequest;
import dev.patika.spring.business.requests.UpdatePublisherRequest;
import dev.patika.spring.business.responses.GetAllAuthorResponse;
import dev.patika.spring.business.responses.GetAllPublisherResponse;
import dev.patika.spring.core.mappers.ModelMapperService;
import dev.patika.spring.dal.abstracts.IAuthorRepository;
import dev.patika.spring.dal.abstracts.IPublisherRepository;
import dev.patika.spring.entity.Author;
import dev.patika.spring.entity.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublisherManager implements IPublisherService {

    @Autowired
    private IPublisherRepository publisherRepository;
    @Autowired
    private ModelMapperService modelMapper;

    @Override
    public List<GetAllPublisherResponse> findAll() {

        return publisherRepository.findAll()
                .stream()
                .map(author -> modelMapper.forResponse().map(author, GetAllPublisherResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public GetAllPublisherResponse getByID(int id) {
        return modelMapper.forResponse()
                .map(publisherRepository.findById(id),GetAllPublisherResponse.class);
    }

    @Override
    public Publisher save(AddPublisherRequest author) {
        return publisherRepository.save(modelMapper.forRequest().map(author,Publisher.class));
    }

    @Override
    public Publisher update(UpdatePublisherRequest author) {
        return publisherRepository.save(modelMapper.forRequest().map(author,Publisher.class));
    }

    @Override
    public void delete(int id) {
        publisherRepository.deleteById(id);
    }
}
