package com.company.mapstruct.secondary.repository;

import com.company.mapstruct.secondary.model.GoodTypeBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 16:02
 */
public interface GoodTypeRepository extends JpaRepository<GoodTypeBean,Long> {

}
