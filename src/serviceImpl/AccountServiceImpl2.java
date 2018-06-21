package serviceImpl;

import domain.AccountBean;
import service.AccountService2;
import java.util.*;

public class AccountServiceImpl2 implements AccountService2 {
	List<AccountBean> list;
	
	public AccountServiceImpl2() {
		list=new ArrayList<>();
	}
	
	@Override
	public void createAccount(AccountBean ac) {
		ac.setAccountNo(createAccountNo()); //set을 넣어야해
		ac.setAccountType(ac.getAccountType());
		ac.setCreateDate(ac.getCreateDate());
		ac.setMoney(ac.getMoney());
		list.add(ac);
		
	}
	private String createAccountNo() {
		return String.format("%s - %s - %s",createRandom(0,999),createRandom(0,999),createRandom(0,999));
	}
	private String createRandom(int start,int end) {
		return String.format("%03d",(int)(Math.random()*end)+start);
	}
	
	@Override
	public List<AccountBean> list() {
		return list;
	}

	@Override
	public List<AccountBean> FindByName(String param) {  ///★★★★
		List<AccountBean> temp = new ArrayList<>();
		for(AccountBean e : list) {
			if(param.equals(e.getName())) {
				temp.add(e);
			}
		}
		
		/*for(int i=0; i<list.size();i++) {
			if(param.equals(list.get(i).getName())) {
				temp.add(list.get(i));///★★★★
			}
		}*/
		return temp;    //★★★★
	}

	@Override
	public AccountBean search(AccountBean ac) {
		AccountBean arr = new AccountBean();
		for(int i=0; i<list.size();i++) {
			if(ac.getUid().equals(list.get(i).getUid())) {
				arr = list.get(i);
				break;
			}
		}
		return arr;
	}

	@Override
	public void updatePw(AccountBean ac) {
		list.get(list.indexOf(search(ac))).setPw(ac.getPw()); //★★★★
	}

	@Override
	public void deleteMember(AccountBean ac) {
		//list.remove(list.get(list.indexOf(search(ac))));  //★★★★
		list.remove(list.indexOf(search(ac)));
	}






}