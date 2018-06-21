package controller;

import javax.swing.JOptionPane;

import controller.AccountController.AccountButt;
import domain.*;
import service.*;
import serviceImpl.*;

enum MemberButt {
	// JOIN은 일반유저 추가, ADD는 직원 추가
	EXIT, 
	JOIN, ADD_STAFF_ONLY, 
	LIST, FIND_BY_ID, FIND_BY_NAME, COUNT,
	UPDATE, 
	WITHDRAWAL,
};

public class MemberController {
	
	public void createUser() {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		member = new UserBean();
		member.setUid(JOptionPane.showInputDialog("ID"));
		member.setPw(JOptionPane.showInputDialog("비번")); 
		member.setName(JOptionPane.showInputDialog("이름"));
		member.setSsn(JOptionPane.showInputDialog("주민번호"));
		member.setPhone(JOptionPane.showInputDialog("전화번호"));
		member.setEmail(JOptionPane.showInputDialog("이메일"));
		member.setAddr(JOptionPane.showInputDialog("주소"));
	}
	public void createStaff() {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		member = new StaffBean();
		member.setUid(JOptionPane.showInputDialog("ID"));
		member.setPw(JOptionPane.showInputDialog("비번")); 
		member.setName(JOptionPane.showInputDialog("이름"));
		member.setSsn(JOptionPane.showInputDialog("주민번호"));
		member.setPhone(JOptionPane.showInputDialog("전화번호"));
		member.setEmail(JOptionPane.showInputDialog("이메일"));
		member.setAddr(JOptionPane.showInputDialog("주소"));
	}
	public void list() {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		JOptionPane.showMessageDialog(null, service.list());
	}
	public void count() {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		JOptionPane.showMessageDialog(null, service.count());
	}
	public void findById() {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("ID 입력"));
		member.setPw(JOptionPane.showInputDialog("비밀번호 입력"));
		JOptionPane.showMessageDialog(null, service.findById(member));
	}
	public void findByName() {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("이름 입력")));
	}
	public void update() {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("ID 입력"));
		member.setPw(JOptionPane.showInputDialog("비밀번호 입력") 
				+ "/" + 
				JOptionPane.showInputDialog("새로운 비밀번호 입력"));
		service.updatePassword(member);
	}
	public void delete() {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("ID 입력"));
		member.setPw(JOptionPane.showInputDialog("비밀번호 입력")
				+ "/" + 
				JOptionPane.showInputDialog("비밀번호 재확인"));
		 service.deleteMember(member);
	}
	
	
	
	
	
	
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
				break;
			case ADD_STAFF_ONLY:
				break;
			case LIST:
				break;
			case COUNT:
				break;
			case FIND_BY_ID:
				break;
			case FIND_BY_NAME:
				break;
			case UPDATE:
				break;
			case WITHDRAWAL:
				break;
			default:
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
