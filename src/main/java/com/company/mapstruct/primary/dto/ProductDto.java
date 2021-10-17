package com.company.mapstruct.primary.dto;

import com.company.mapstruct.primary.model.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 10:02
 */

@Getter
@Setter
public class ProductDto {

    @Id
    private int id;
    private String name;
    private String description;
    private int quantity;
    private long price;
    private String itemId;
    private List<Item> itemsList;

}
