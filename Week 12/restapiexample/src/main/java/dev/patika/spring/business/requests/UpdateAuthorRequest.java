package dev.patika.spring.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAuthorRequest {
    private int id;
    private String authorName;
    private LocalDate authorBirthDate;
    private String authorCountry;
}
