package dev.patika.spring.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddPublisherRequest {
    private String publisherName;
    private LocalDate establishmentYear;
    private String publisherAddress;

}
