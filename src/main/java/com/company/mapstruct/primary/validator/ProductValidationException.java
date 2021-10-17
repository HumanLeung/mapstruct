package com.company.mapstruct.primary.validator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 13:09
 */

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProductValidationException extends RuntimeException {
    public ProductValidationException(String message){
        super(message);
    }
}
