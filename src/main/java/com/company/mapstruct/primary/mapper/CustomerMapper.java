package com.company.mapstruct.primary.mapper;

import com.company.mapstruct.primary.model.Customer;
import com.company.mapstruct.primary.dto.CustomerDto;
import com.company.mapstruct.primary.model.Title;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 13:42
 */

@Mapper
public interface CustomerMapper {

    @Mapping(target = "customerId", source = "customer.id")
    @Mapping(target = "dateOfBirth", dateFormat="dd.MM.yyyy")
//    @Mapping(target = "",ignore = true)
    @Mapping(target = "fullName", expression = "java(customer.getFirstName() + customer.getLastName())")
    CustomerDto customerToDto(Customer customer);

    default String toString(Title title){
        return title.getValue();
    }


}
