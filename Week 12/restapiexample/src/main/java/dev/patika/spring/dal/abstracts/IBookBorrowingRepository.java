package dev.patika.spring.dal.abstracts;

import dev.patika.spring.entity.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookBorrowingRepository extends JpaRepository<BookBorrowing,Integer> {
}
