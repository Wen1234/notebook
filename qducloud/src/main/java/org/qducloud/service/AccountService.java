package org.qducloud.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.qducloud.bean.Account;

/**
 * @author Cuiql
 */
public interface AccountService {
	Map<String,Object> login(String username, String password,HttpServletRequest request);
	String reg(Account account);
}
