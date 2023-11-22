package dev.patika.spring.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllCategoryResponse {

    private String categoryName;
    private String categoryDescription;
}
