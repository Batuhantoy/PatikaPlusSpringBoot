package dev.patika.spring.business.concretes;

import dev.patika.spring.business.abstracts.IBookBorrowingService;
import dev.patika.spring.business.requests.AddBorrowingRequest;
import dev.patika.spring.business.requests.UpdateBorrowingRequest;
import dev.patika.spring.business.responses.GetAllAuthorResponse;
import dev.patika.spring.business.responses.GetAllBorrowingResponse;
import dev.patika.spring.core.mappers.ModelMapperService;
import dev.patika.spring.dal.abstracts.IBookBorrowingRepository;
import dev.patika.spring.entity.Author;
import dev.patika.spring.entity.BookBorrowing;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookBorrowingManager implements IBookBorrowingService {
    @Autowired
    private IBookBorrowingRepository borrowingRepository;

    @Autowired
    private ModelMapperService modelMapper;
    @Override
    public List<GetAllBorrowingResponse> findAll() {
        return borrowingRepository.findAll()
                .stream()
                .map(author -> modelMapper.forResponse().map(author, GetAllBorrowingResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public GetAllBorrowingResponse getByID(int id) {
        return modelMapper.forResponse()
                .map(borrowingRepository.findById(id),GetAllBorrowingResponse.class);
    }

    @Override
    public BookBorrowing save(AddBorrowingRequest borrowing) {
        return borrowingRepository.save(modelMapper.forRequest().map(borrowing, BookBorrowing.class));
    }

    @Override
    public BookBorrowing update(UpdateBorrowingRequest borrowing) {
        return borrowingRepository.save(modelMapper.forRequest().map(borrowing, BookBorrowing.class));
    }

    @Override
    public void delete(int id) {
        borrowingRepository.deleteById(id);
    }
}
