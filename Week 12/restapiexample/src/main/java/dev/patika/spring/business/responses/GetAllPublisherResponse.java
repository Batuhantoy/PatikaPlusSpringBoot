package dev.patika.spring.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllPublisherResponse {
    private String publisherName;
    private LocalDate establishmentYear;
    private String publisherAddress;
}
