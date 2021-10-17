package com.company.mapstruct.secondary.repository;

import com.company.mapstruct.secondary.model.GoodInfoBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 16:03
 */
@Repository
public interface GoodInfoRepository extends JpaRepository<GoodInfoBean,Long> {
}
