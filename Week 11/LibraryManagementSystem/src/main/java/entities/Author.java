package entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tbl_author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id",columnDefinition = "serial")
    private int id;

    @Column(name = "author_name",length = 100,nullable = false)
    private String authorName;

    @Temporal(TemporalType.DATE)
    @Column(name = "author_birthDate",nullable = false)
    private LocalDate authorBirthDate;

    @Column(name = "author_country",length = 100,nullable = false)
    private String authorCountry;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private List<Book> bookList;

    public Author() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getAuthorBirthDate() {
        return authorBirthDate;
    }

    public void setAuthorBirthDate(LocalDate authorBirthDate) {
        this.authorBirthDate = authorBirthDate;
    }

    public String getAuthorCountry() {
        return authorCountry;
    }

    public void setAuthorCountry(String authorCountry) {
        this.authorCountry = authorCountry;
    }
}
