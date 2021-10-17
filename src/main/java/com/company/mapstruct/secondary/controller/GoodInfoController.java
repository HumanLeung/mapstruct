package com.company.mapstruct.secondary.controller;

import com.company.mapstruct.secondary.converter.GoodInfoMapper;
import com.company.mapstruct.secondary.dto.GoodInfoDTO;
import com.company.mapstruct.secondary.model.GoodInfoBean;
import com.company.mapstruct.secondary.model.GoodTypeBean;
import com.company.mapstruct.secondary.repository.GoodInfoRepository;
import com.company.mapstruct.secondary.repository.GoodTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 16:10
 */
@RestController
public class GoodInfoController {
   final private GoodInfoRepository goodInfoRepository;
   final private GoodTypeRepository goodTypeRepository;
   final private GoodInfoMapper goodInfoMapper;

   @Autowired
   public GoodInfoController(GoodInfoRepository goodInfoRepository,
                             GoodTypeRepository goodTypeRepository,
                             GoodInfoMapper goodInfoMapper
   ){
       this.goodInfoRepository = goodInfoRepository;
       this.goodTypeRepository = goodTypeRepository;
       this.goodInfoMapper =goodInfoMapper;
   }

    @RequestMapping(value = "/detail/{id}")
    public GoodInfoDTO detail(@PathVariable("id") Long id)
    {
        //查询商品基本信息
        GoodInfoBean goodInfoBean = goodInfoRepository.findById(id).get();
        //查询商品类型基本信息
        GoodTypeBean typeBean = goodTypeRepository.findById(goodInfoBean.getTypeId()).get();
        //返回转换dto
        return goodInfoMapper.from(goodInfoBean,typeBean);
    }


}
