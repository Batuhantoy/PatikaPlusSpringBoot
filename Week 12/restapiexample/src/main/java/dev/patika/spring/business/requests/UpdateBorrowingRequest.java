package dev.patika.spring.business.requests;

import jakarta.persistence.Access;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBorrowingRequest {
    private String borrowerName;
    private LocalDate borrowDate;
    private LocalDate returnDate;
}
