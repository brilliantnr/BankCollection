package service;

import java.util.List;

import domain.*;


public interface AccountService2 {
	public void createAccount(AccountBean ac);
	public List<AccountBean> list();
	public List<AccountBean> FindByName(String param);
	public AccountBean search(AccountBean ac);
	public void updatePw(AccountBean ac);
	public void deleteMember(AccountBean ac);
}
