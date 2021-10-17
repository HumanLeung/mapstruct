package com.company.mapstruct.primary.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 13:33
 */

@Getter
@Setter
public class Customer {

    private long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private BigDecimal creditScore;
    private Title title;
}
