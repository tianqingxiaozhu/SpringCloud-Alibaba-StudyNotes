package com.tianqingxiaozhu.seataorder.dao;

import com.tianqingxiaozhu.seataorder.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shawnwang
 */
@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

}
