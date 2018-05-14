package org.qducloud.controller.sys;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.qducloud.bean.Account;
import org.qducloud.service.AccountService;
/*import org.apache.log4j.Logger;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/**
 * @author Cuiql
 */
@Api(tags="账户操作控制类")
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class AccountController {
	private static final String INDEX_URL="index";
	private static final String User_Role = "063f862b-bf60-4f01-b9b5-3209791287ab";//普通用户
	/*private final Logger log =Logger.getLogger(LoginController.class);*/
	
	@Autowired
	private AccountService accountService;
	@GetMapping("/")
	@ApiOperation(value="首页")
	public String index(){
		System.out.println(INDEX_URL);
		return INDEX_URL;
	}
	@ResponseBody
	@GetMapping("sys/login")
	@ApiOperation(value="登录")
	public Map<String,Object> login(String username,String password,HttpServletRequest request){
		return accountService.login(username, password,request);
	}
	@ResponseBody
	@GetMapping("sys/reg")
	@ApiOperation(value="注册")
	public String reg(Account account){
		account.setRid(User_Role);
		return accountService.reg(account);
	}
}
