package dev.patika.spring.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBorrowingRequest {
    private String borrowerName;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private int book_id;
}
