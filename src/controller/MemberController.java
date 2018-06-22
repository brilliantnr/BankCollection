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
	private static MemberController instance = new MemberController();  //★
	public static MemberController getInstance() {return instance;}  
	//MemberService service;
	private MemberController() {
		//service = new MemberServiceImpl();  //서비스임플 객체 만들어지면서 impl생성자 작동해서 dao 도 생성됨
	}

	public void createUser(UserBean member) {
		System.out.println("====멤버 컨트롤러 ====");
		System.out.println("화면에서 넘어온 객체 :"+member);
		//service.createUser(member);  //컨트롤러에선 캐스팅X, service에서 알아서 연산해야함
		MemberServiceImpl.getInstance().createUser(member);  //Singleton Pattern 사용
	}

	public void updatePassword() {
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("ID 입력"));
		member.setPw(JOptionPane.showInputDialog("비밀번호 입력") 
				+ "/" + 
				JOptionPane.showInputDialog("새로운 비밀번호 입력"));
		//service.updatePassword(member);
	}
	
	public void deleteMember() {
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("ID 입력"));
		member.setPw(JOptionPane.showInputDialog("비밀번호 입력")
				+ "/" + 
				JOptionPane.showInputDialog("비밀번호 재확인"));
		 //service.deleteMember(member);
	}
	
	
}