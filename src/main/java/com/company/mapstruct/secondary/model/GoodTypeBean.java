package com.company.mapstruct.secondary.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 15:58
 */

@Entity
@Table(name = "good_types")
@Data
public class GoodTypeBean {
    @Id
    @Column(name = "tgt_id")
    private Long id;

    @Column(name = "tgt_name")
    private String name;
    @Column(name = "tgt_is_show")
    private int show;
    @Column(name = "tgt_order")
    private int order;

}
