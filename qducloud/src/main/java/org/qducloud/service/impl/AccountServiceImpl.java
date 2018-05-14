package org.qducloud.service.impl;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.qducloud.bean.Account;
import org.qducloud.mapper.sys.AccountMapper;
import org.qducloud.service.AccountService;
/**
 * @author Cuiql
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author Cuiql
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountMapper accountMapper;
	@Override
	public Map<String,Object> login(String username, String password,HttpServletRequest request) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<>();
		Account account =accountMapper.findAccountUserName(username);
		if(account==null){
			map.put("status", "not have this user");
			return map;
		}else{
			if(account.getPassword().equals(password)){
				request.getSession().setAttribute("account", account);
				map.put("status", "success");
				map.put("account", account);
				return map;
			}else{
				map.put("status", "password wrong");
				return map;
			}
		}
	}
	@Override
	public String reg(Account account) {
		// TODO Auto-generated method stub
		try {
			accountMapper.addAccount(account);
			return "success";
		}catch(Exception e) {
			e.printStackTrace();
			return "error";
		}
		 
	}
	

}
