package com.company.mapstruct.primary.validator;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 13:08
 */
@Component
public class ProductValidator {

    public int validate(int id) throws ProductValidationException {
        if (id == -1){
            throw new ProductValidationException("Bad");
        }
        return id;
    }
}
