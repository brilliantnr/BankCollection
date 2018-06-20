package controller;

import java.util.List;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;
 
public class AccountController {
	enum AccountButt { 
		BASIC, MINUSACCOUNT, LIST, MINUS_LIST, FIND_BY_ID, FIND_BY_NAME,CHANGE_PW,DELETE_ACCOUNT, EXIT
	};
 
	public static void main(String[] args) {
		AccountButt[] buttons = { AccountButt.BASIC, AccountButt.MINUSACCOUNT, AccountButt.LIST, AccountButt.MINUS_LIST,
				AccountButt.FIND_BY_ID, AccountButt.FIND_BY_NAME, AccountButt.CHANGE_PW,
				AccountButt.DELETE_ACCOUNT,AccountButt.EXIT };
		AccountBean ac=null;  //★선언만 하는건 인터페이스, 클래스에선 초기화
		AccountService service = new AccountServiceImpl();
	
		while (true) {
			AccountButt select = (AccountButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null);
			
			switch (select) {
			case EXIT:
				return;
			case BASIC: 
				ac = new AccountBean();
				ac.setName(JOptionPane.showInputDialog("이름"));
				ac.setUid(JOptionPane.showInputDialog("아이디"));
				ac.setPw(JOptionPane.showInputDialog("비번"));
				
				break;
			case MINUSACCOUNT:
			
				break;
			case LIST:
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case MINUS_LIST:
				
				break;
			case FIND_BY_ID:
				JOptionPane.showInputDialog(null, service.search(ac));
				break;
			case FIND_BY_NAME:
				JOptionPane.showInputDialog(null, service.FindByName(ac.getName()));
				break;
			case CHANGE_PW:	
				service.updatePw(ac);
			case DELETE_ACCOUNT:
				service.deleteMember(ac);
			break;
			default:
				break;
			}
		}
	}
}
