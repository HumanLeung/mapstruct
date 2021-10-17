package com.company.mapstruct.primary.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 13:34
 */
@Getter
@Setter
public class CustomerDto {
    public long customerId;
    public String firstName;
    public String lastName;
    public double creditScore;
    public String dateOfBirth;
    public String fullName;
    public String title;
}
