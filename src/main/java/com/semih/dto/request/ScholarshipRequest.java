package com.semih.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ScholarshipRequest {

//    @NotNull(message = "amount cannot be null")
//    @DecimalMin(value = "10.00", message = "amount must be at least 10")
    private BigDecimal scholarshipAmount;

//    @NotBlank(message = "charityOrganizationName cannot be null or empty")
//    @Size(min = 3, message = "charityOrganizationName must be at least 3 characters long")
    private String charityOrganizationName;

//    @NotBlank(message = "studentName cannot be null or empty")
//    @Size(min = 3, message = "studentName must be at least 3 characters long")
    private String studentName;

//    @NotNull(message = "startingDate cannot be null")
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate startingDate;

//    @NotNull(message = "endingDate cannot be null")
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate endingDate;

}
