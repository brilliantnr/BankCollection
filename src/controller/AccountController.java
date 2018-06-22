package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;
 
public class AccountController {
	private static AccountController instance = new AccountController();
	public static AccountController getInstance() {return instance;}
	private AccountController() {}
	
	enum AccountButt { 
		BASIC, MINUSACCOUNT, LIST, MINUS_LIST, FIND_BY_ID, FIND_BY_NAME,CHANGE_PW,DELETE_ACCOUNT, EXIT
	};
 
	public void basic() {
		AccountBean ac = new AccountBean();
		ac.setName(JOptionPane.showInputDialog("이름"));
		ac.setUid(JOptionPane.showInputDialog("아이디"));
		ac.setPw(JOptionPane.showInputDialog("비번"));
		//service.createAccount(ac);
	}
	public void minusAccount() {
		AccountBean ac=new MinusAccountBean();
		ac.setName(JOptionPane.showInputDialog("이름"));
		ac.setUid(JOptionPane.showInputDialog("아이디"));
		ac.setPw(JOptionPane.showInputDialog("비번"));
		//service.createMinusAccount((MinusAccountBean)ac);
	}
	public void list() {
		//JOptionPane.showMessageDialog(null, service.list());
	}
	
	public void findById() {
		AccountBean ac =new AccountBean();
		ac.setName(JOptionPane.showInputDialog("이름"));
		ac.setUid(JOptionPane.showInputDialog("아이디"));
		ac.setPw(JOptionPane.showInputDialog("비번"));
		//JOptionPane.showInputDialog(null, service.findById(ac));
	}
	public void findByName() {
		AccountBean ac=null;
		//JOptionPane.showInputDialog(null, service.findByName(JOptionPane.showInputDialog("이름?")));
	}
	public void updatePw() {
		AccountBean ac = new AccountBean();
		ac.setUid(JOptionPane.showInputDialog("아이디"));
		ac.setPw((JOptionPane.showInputDialog("비밀번호")
				+"/"+
				JOptionPane.showInputDialog("새로운 비밀번호")));
		//service.updatePw(ac);
	}
	public void deleteAccount() {
		AccountBean ac=new AccountBean();
		ac.setUid(JOptionPane.showInputDialog("삭제할 계좌의 아이디"));
		ac.setPw(JOptionPane.showInputDialog("비밀번호")
				+"/"+
				JOptionPane.showInputDialog("비밀번호 확인"));
		//service.deleteAccount(ac);
	}
}
