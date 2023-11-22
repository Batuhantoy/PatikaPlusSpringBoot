package dev.patika.spring.dal.abstracts;

import dev.patika.spring.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorRepository extends JpaRepository<Author,Integer> {
}
