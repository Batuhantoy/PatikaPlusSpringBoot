package dev.patika.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tbl_author")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id", columnDefinition = "serial")
    private int id;

    @Column(name = "author_name", length = 100, nullable = false)
    private String authorName;

    @Temporal(TemporalType.DATE)
    //@JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "author_birthDate", nullable = false)
    private LocalDate authorBirthDate;

    @Column(name = "author_country", length = 100, nullable = false)
    private String authorCountry;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private List<Book> bookList;
}