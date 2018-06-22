package serviceImpl;

import domain.AccountBean;
import domain.MinusAccountBean;
import service.AccountService;
import java.util.*;
import java.text.SimpleDateFormat;



public class AccountServiceImpl implements AccountService {
	private static AccountService instance = new AccountServiceImpl();
	public static AccountService getInstance() {return instance;}
	private AccountServiceImpl() {}
	
	
	@Override
	public void createAccount(AccountBean ac) {
		ac.setAccountNo(createAccountNo());
		ac.setAccountType(ac.getAccountType());
		ac.setCreateDate(createDate());
		ac.setMoney(ac.getMoney());
		//map.put(ac.getUid(),ac);
	}

	private String createDate() {
		return new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초").format(new Date());
	}

	private String createAccountNo() {
		return String.format("%s-%s-%s", createRandomNo(),createRandomNo(),createRandomNo());
	}

	private String createRandomNo() {
		return String.format("%03d",(int)(Math.random()*1000));
	}

	@Override
	public void createMinusAccount(MinusAccountBean minusAc) {
		// TODO Auto-generated method stub
	}


	@Override
	public AccountBean findById(AccountBean ac) {
		return ac;//map.get(ac.getUid());
	}

	@Override
	public void updatePw(AccountBean ac) {
		String oldpw= ac.getPw().split("/")[0];
		String newpw= ac.getPw().split("/")[1];
		/*if(oldpw.equals(map.get(ac.getUid()).getPw())) {
			map.get(ac.getUid()).setPw(newpw);
		}*/
	}

	@Override
	public void deleteAccount(AccountBean ac) {
		String pw= ac.getPw().split("/")[0];
		String confirmPw= ac.getPw().split("/")[1];
		if(pw.equals(confirmPw)) {
		//	map.remove(ac.getUid());
		}
	}
	
}