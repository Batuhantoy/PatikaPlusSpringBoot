package dev.patika.spring.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddAuthorRequest {

    private String authorName;
    //@JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate authorBirthDate;
    private String authorCountry;
}
