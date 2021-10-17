package com.company.mapstruct.secondary.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 16:00
 */

@Entity
@Table(name = "good_infos")
@Data
public class GoodInfoBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tg_id")
    private Long id;
    @Column(name = "tg_title")
    private String title;
    @Column(name = "tg_price")
    private double price;
    @Column(name = "tg_order")
    private int order;
    @Column(name = "tg_type_id")
    private Long typeId;
}
