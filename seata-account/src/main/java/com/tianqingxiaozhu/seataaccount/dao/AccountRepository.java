package com.tianqingxiaozhu.seataaccount.dao;

import com.tianqingxiaozhu.seataaccount.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shawnwang
 */
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    Account findAccountByUserId(String userId);
}
