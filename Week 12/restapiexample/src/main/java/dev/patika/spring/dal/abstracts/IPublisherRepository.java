package dev.patika.spring.dal.abstracts;

import dev.patika.spring.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPublisherRepository extends JpaRepository<Publisher,Integer> {
}
