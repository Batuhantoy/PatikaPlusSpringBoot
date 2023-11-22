package dev.patika.spring.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBookRequest {
    private String bookName;
    private LocalDate publicationDate;
    private int author_id;
}
