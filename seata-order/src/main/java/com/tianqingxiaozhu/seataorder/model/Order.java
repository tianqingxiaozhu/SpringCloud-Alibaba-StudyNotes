package com.tianqingxiaozhu.seataorder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author shawnwang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "t_order")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "product_id")
    private Long productId;

    @Column
    private Long num;

    @Column
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;
}
