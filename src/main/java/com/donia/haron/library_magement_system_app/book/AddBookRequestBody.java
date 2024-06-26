package com.donia.haron.library_magement_system_app.book;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.ISBN;

import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddBookRequestBody {

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Description is required")
    private String description;

    @PastOrPresent(message = "Publication date cannot be in the future")
    @NotNull(message = "Publication year is required")
    @Schema(example = "2020")
    private Year publicationYear;

    @NotBlank(message = "ISBN is required")
    @ISBN(message = "Invalid ISBN")
    @Schema(example = "97801246869221")
    private String isbn;

    @NotBlank(message = "Author is required")
    private String author;
}
