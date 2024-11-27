package com.semih.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.semih.enums.ProfitOrLoss;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="report")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Report extends BaseEntity{

    private String title;

    private String description;

    private BigDecimal total_income;

    private BigDecimal total_expense;

    private BigDecimal net_balance;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") // JSON'da ISO formatı sağlar
    private LocalDate startingDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate endingDate;

    @ManyToOne
    private CharityOrganization charityOrganization;

    @Enumerated(EnumType.STRING)
    private ProfitOrLoss profitOrLoss;


}