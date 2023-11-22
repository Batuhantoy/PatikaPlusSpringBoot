package dev.patika.spring.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBookRequest {
    private String bookName;
    private LocalDate publicationDate;
    private int stock ;
    private int author_id;
    private int publisher_id;

}
