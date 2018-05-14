package org.qducloud.mapper.sys;
/**
 * @author Cuiql
 */

import org.apache.ibatis.annotations.Mapper;
import org.qducloud.bean.Account;

import java.util.List;


@Mapper
public interface AccountMapper {
	public Account findAccountUserName(String userName);
	public void addAccount(Account account);
	public void updateAccount(Account account);
	public List<Account> selectPage(int start, int end);
}
