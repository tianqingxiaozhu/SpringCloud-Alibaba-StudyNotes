package com.tianqingxiaozhu.seataaccount.service;

import com.tianqingxiaozhu.seataaccount.model.Account;

/**
 * @author shawnwang
 */
public interface AccountService {
    /**
     * 获取余额
     * @param userId
     * @return
     */
    Account getByUserId(String userId);

    /**
     * 扣余额
     * @param userId
     * @param money
     */
    void deduct(String userId, Long money);


}

