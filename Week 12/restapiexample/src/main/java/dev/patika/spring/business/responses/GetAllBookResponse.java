package dev.patika.spring.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBookResponse {

    private String bookName;
    private LocalDate publicationDate;
    private int stock ;
    private String authorName;
    private String authorCountry;
    
}
