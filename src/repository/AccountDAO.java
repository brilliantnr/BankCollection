package repository;

import java.util.List;

import domain.AccountBean;

public interface AccountDAO {
	public void insertAccount(AccountBean account);
	public List<AccountBean> selectList();
	public List<AccountBean> selectAccountByName(String name);
	public AccountBean selectAccountByID(String id);
	public int countAccounts();
	public void updateAccount(AccountBean account);
	public void deleteAccount(AccountBean account);

}
