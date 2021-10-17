package com.company.mapstruct.primary.repository;

import com.company.mapstruct.primary.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 11:54
 */
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
