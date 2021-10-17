package com.company.mapstruct.secondary.dto;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 16:04
 */

@Data
public class GoodInfoDTO {

    //商品编号
    private String goodId;
    //商品名称
    private String goodName;
    //商品价格
    private double goodPrice;
    //类型名称
    private String typeName;
}
