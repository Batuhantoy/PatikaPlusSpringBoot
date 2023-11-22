package dev.patika.spring.business.responses;

import java.time.LocalDate;

public class GetAllBorrowingResponse {
    private String borrowerName;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private String bookName;
}
