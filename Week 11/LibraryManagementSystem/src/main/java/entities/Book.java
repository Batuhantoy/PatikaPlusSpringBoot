package entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tbl_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id",columnDefinition = "serial")
    private int id;

    @Column(name = "book_name",length = 100,nullable = false)
    private String bookName;

    @Temporal(TemporalType.DATE)
    @Column(name = "book_publicationYear",nullable = false)
    private LocalDate publicationDate;

    @Column(name = "book_stock",nullable = false)
    private int stock ;

    // each book has one author
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id",referencedColumnName = "author_id")
    private Author author;


    // A category has many books AND A book can have many category
    @ManyToMany
    @JoinTable(name = "category_to_book",joinColumns = {@JoinColumn(name = "book_id")},inverseJoinColumns = {@JoinColumn(name = "category_id")})
    private List<Category> categoryList;

    // each book has one publisher
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id",referencedColumnName = "publisher_id")
    private Publisher publisher;


    // a book can have many barrowings
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
    private List<BookBorrowing> barrowHistory;

}
