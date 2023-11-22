package dev.patika.spring.business.abstracts;

import dev.patika.spring.business.requests.AddPublisherRequest;
import dev.patika.spring.business.requests.UpdatePublisherRequest;
import dev.patika.spring.business.responses.GetAllPublisherResponse;
import dev.patika.spring.entity.Book;
import dev.patika.spring.entity.Publisher;

import java.util.List;

public interface IPublisherService {

    List<GetAllPublisherResponse> findAll();
    GetAllPublisherResponse getByID(int id);
    Publisher save(AddPublisherRequest publisher);
    Publisher update(UpdatePublisherRequest publisher);
    void delete(int id);
}
