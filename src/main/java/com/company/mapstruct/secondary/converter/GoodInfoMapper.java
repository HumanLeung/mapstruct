package com.company.mapstruct.secondary.converter;

import com.company.mapstruct.secondary.dto.GoodInfoDTO;
import com.company.mapstruct.secondary.model.GoodInfoBean;
import com.company.mapstruct.secondary.model.GoodTypeBean;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 16:05
 */

@Mapper(componentModel = "spring")
public interface GoodInfoMapper {

    @Mappings({
            @Mapping(source = "type.name",target = "typeName"),
            @Mapping(source = "good.id",target = "goodId"),
            @Mapping(source = "good.title",target = "goodName"),
            @Mapping(source = "good.price",target = "goodPrice")
    })
    public GoodInfoDTO from(GoodInfoBean good, GoodTypeBean type);

}
