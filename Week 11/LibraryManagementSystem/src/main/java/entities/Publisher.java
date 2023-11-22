package entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tbl_publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id",columnDefinition = "serial")
    private int id;

    @Column(name = "publisher_name",length = 100,nullable = false)
    private String publisherName;

    @Temporal(TemporalType.DATE)
    @Column(name = "publisher_establishmentYear",nullable = false)
    private LocalDate establishmentYear;

    @Column(name = "publisher_address",length = 100,nullable = false)
    private String publisherAddress;

    // A publisher has many books
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "publisher")
    private List<Book> bookList;

    public Publisher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public LocalDate getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(LocalDate establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }
}
