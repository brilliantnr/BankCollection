package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;
 
public class AccountController {
	enum AccountButt { 
		BASIC, MINUSACCOUNT, LIST, MINUS_LIST, FIND_BY_ID, FIND_BY_NAME,CHANGE_PW,DELETE_ACCOUNT, EXIT
	};
 
	public void basic() {
		AccountService service = new AccountServiceImpl();
		AccountBean ac = new AccountBean();
		ac.setName(JOptionPane.showInputDialog("이름"));
		ac.setUid(JOptionPane.showInputDialog("아이디"));
		ac.setPw(JOptionPane.showInputDialog("비번"));
		service.createAccount(ac);
	}
	public void minusAccount() {
		AccountService service = new AccountServiceImpl();
		AccountBean ac=new MinusAccountBean();
		ac.setName(JOptionPane.showInputDialog("이름"));
		ac.setUid(JOptionPane.showInputDialog("아이디"));
		ac.setPw(JOptionPane.showInputDialog("비번"));
		service.createMinusAccount((MinusAccountBean)ac);
	}
	public void list() {
		AccountService service = new AccountServiceImpl();
		JOptionPane.showMessageDialog(null, service.list());
	}
	
	public void findById() {
		AccountService service = new AccountServiceImpl();
		AccountBean ac =new AccountBean();
		ac.setName(JOptionPane.showInputDialog("이름"));
		ac.setUid(JOptionPane.showInputDialog("아이디"));
		ac.setPw(JOptionPane.showInputDialog("비번"));
		JOptionPane.showInputDialog(null, service.findById(ac));
	}
	public void findByName() {
		AccountBean ac=null;
		AccountService service = new AccountServiceImpl();
		JOptionPane.showInputDialog(null, service.findByName(JOptionPane.showInputDialog("이름?")));
	}
	public void updatePw() {
		AccountService service = new AccountServiceImpl();
		AccountBean ac = new AccountBean();
		ac.setUid(JOptionPane.showInputDialog("아이디"));
		ac.setPw((JOptionPane.showInputDialog("비밀번호")
				+"/"+
				JOptionPane.showInputDialog("새로운 비밀번호")));
		service.updatePw(ac);
	}
	public void deleteAccount() {
		AccountService service = new AccountServiceImpl();
		AccountBean ac=new AccountBean();
		ac.setUid(JOptionPane.showInputDialog("삭제할 계좌의 아이디"));
		ac.setPw(JOptionPane.showInputDialog("비밀번호")
				+"/"+
				JOptionPane.showInputDialog("비밀번호 확인"));
		service.deleteAccount(ac);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		AccountButt[] buttons = { AccountButt.BASIC, AccountButt.MINUSACCOUNT, AccountButt.LIST, AccountButt.MINUS_LIST,
				AccountButt.FIND_BY_ID, AccountButt.FIND_BY_NAME, AccountButt.CHANGE_PW,
				AccountButt.DELETE_ACCOUNT,AccountButt.EXIT };
		
	
		while (true) {
			AccountButt select = (AccountButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null);
			
			switch (select) {
			case EXIT:
				return;
			case BASIC: 
				break;
			case MINUSACCOUNT:
				break;
			case LIST:
				break;
			case MINUS_LIST:
				break;
			case FIND_BY_ID:
				break;
			case FIND_BY_NAME:
				break;
			case CHANGE_PW:	
				break;
			case DELETE_ACCOUNT:
			break;
			default:
				break;
			}
		}
	}
}
