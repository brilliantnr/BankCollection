package controller;

import javax.swing.JOptionPane;

import controller.AccountController.AccountButt;
import domain.*;
import service.*;
import serviceImpl.*;

enum AdminButt {
	// JOIN은 일반유저 추가, ADD는 직원 추가
	EXIT, 
	JOIN, ADD_STAFF_ONLY, 
	LIST, FIND_BY_ID, FIND_BY_NAME, COUNT,
	UPDATE, 
	REMOVE,
};

public class AdminController {
	public static void main(String[] args) {
		MemberButt[] buttons = { MemberButt.EXIT, 
				MemberButt.JOIN, MemberButt.ADD_STAFF_ONLY, 
				MemberButt.LIST,MemberButt.COUNT, MemberButt.FIND_BY_ID, MemberButt.FIND_BY_NAME, 
				MemberButt.UPDATE,
				MemberButt.WITHDRAWAL };

		MemberBean member = null;
		MemberService service = new MemberServiceImpl();

		while (true) {
			MemberButt select = (MemberButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null);
			switch (select) {
			case EXIT:
				return;
			case JOIN:
				member = new UserBean();
				member.setUid(JOptionPane.showInputDialog("ID"));
				member.setPw(JOptionPane.showInputDialog("비번")); 
				member.setName(JOptionPane.showInputDialog("이름"));
				member.setSsn(JOptionPane.showInputDialog("주민번호"));
				member.setPhone(JOptionPane.showInputDialog("전화번호"));
				member.setEmail(JOptionPane.showInputDialog("이메일"));
				member.setAddr(JOptionPane.showInputDialog("주소"));
				break;

			case ADD_STAFF_ONLY:
				member = new StaffBean();
				member.setUid(JOptionPane.showInputDialog("ID"));
				member.setPw(JOptionPane.showInputDialog("비번")); 
				member.setName(JOptionPane.showInputDialog("이름"));
				member.setSsn(JOptionPane.showInputDialog("주민번호"));
				member.setPhone(JOptionPane.showInputDialog("전화번호"));
				member.setEmail(JOptionPane.showInputDialog("이메일"));
				member.setAddr(JOptionPane.showInputDialog("주소"));
				break;
			case LIST:
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case COUNT:
				JOptionPane.showMessageDialog(null, service.count());
				break;
			case FIND_BY_ID:
				member = new MemberBean();
				member.setUid(JOptionPane.showInputDialog("ID 입력"));
				member.setPw(JOptionPane.showInputDialog("비밀번호 입력"));
				JOptionPane.showMessageDialog(null, service.findById(member));
				break;
			case FIND_BY_NAME:
				JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("이름 입력")));
				break;
			case UPDATE:
				member = new MemberBean();
				member.setUid(JOptionPane.showInputDialog("ID 입력"));
				member.setPw(JOptionPane.showInputDialog("비밀번호 입력") 
						+ "/" + 
						JOptionPane.showInputDialog("새로운 비밀번호 입력"));
				service.updatePassword(member);

			case WITHDRAWAL:
				member = new MemberBean();
				member.setUid(JOptionPane.showInputDialog("ID 입력"));
				member.setPw(JOptionPane.showInputDialog("비밀번호 입력")
						+ "/" + 
						JOptionPane.showInputDialog("비밀번호 재확인"));
				 service.deleteMember(member);
				break;
			default:
				break;
			}
		}
	}
	
	
	
	

	AccountButt[] buttons = { AccountButt.BASIC, AccountButt.MINUSACCOUNT, AccountButt.LIST, AccountButt.MINUS_LIST,
			AccountButt.FIND_BY_ID, AccountButt.FIND_BY_NAME, AccountButt.CHANGE_PW,
			AccountButt.DELETE_ACCOUNT,AccountButt.EXIT };
	AccountBean ac=null; 
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
			service.createAccount(ac);
			break;
		case MINUSACCOUNT:
			ac=new MinusAccountBean();
			ac.setName(JOptionPane.showInputDialog("이름"));
			ac.setUid(JOptionPane.showInputDialog("아이디"));
			ac.setPw(JOptionPane.showInputDialog("비번"));
			service.createMinusAccount((MinusAccountBean)ac);
			break;
		case LIST:
			JOptionPane.showMessageDialog(null, service.list());
			break;
		case MINUS_LIST:
			
			break;
		case FIND_BY_ID:
			ac =new AccountBean();
			ac.setName(JOptionPane.showInputDialog("이름"));
			ac.setUid(JOptionPane.showInputDialog("아이디"));
			ac.setPw(JOptionPane.showInputDialog("비번"));
			JOptionPane.showInputDialog(null, service.findById(ac));
			break;
		case FIND_BY_NAME:
			JOptionPane.showInputDialog(null, service.findByName(JOptionPane.showInputDialog("이름?")));
			break;
		case CHANGE_PW:	
			ac = new AccountBean();
			ac.setUid(JOptionPane.showInputDialog("아이디"));
			ac.setPw((JOptionPane.showInputDialog("비밀번호")
					+"/"+
					JOptionPane.showInputDialog("새로운 비밀번호")));
			service.updatePw(ac);
			break;
		case DELETE_ACCOUNT:
			ac=new AccountBean();
			ac.setUid(JOptionPane.showInputDialog("삭제할 계좌의 아이디"));
			ac.setPw(JOptionPane.showInputDialog("비밀번호")
					+"/"+
					JOptionPane.showInputDialog("비밀번호 확인"));
			
			service.deleteAccount(ac);
		break;
		default:
			break;
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
}
