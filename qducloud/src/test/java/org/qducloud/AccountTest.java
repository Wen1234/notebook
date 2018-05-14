package org.qducloud;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.qducloud.bean.Account;
import org.qducloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 笔记相关测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountTest {

    @Autowired
    private AccountService accountService;
    @Autowired
    HttpServletRequest request;

    /**
     * 测试登录
     */
    @Test
    public void testLogin(){
        String userName = "dev";
        String password = "dev123";
        Map<String, Object> retMap = accountService.login(userName, password, request);
        Assert.assertEquals("success", retMap.get("status") + "");
    }

    /**
     * 测试注册
     */
    @Test
    public void testReq(){
        Account account = new Account();
        account.setUserName("新用户");
        account.setPassword("密码");
        account.setRid("Rid");
        account.setUid("Uid");
        String ret = accountService.reg(account);
        Assert.assertEquals("success", ret);
    }
}
