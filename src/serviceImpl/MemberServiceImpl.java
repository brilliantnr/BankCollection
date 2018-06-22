package serviceImpl;

import java.util.*;
import repository.*;
import repositoryImpl.*;
import domain.*;
import repositoryImpl.MemberDAOImpl;
import service.MemberService;
	
public class MemberServiceImpl implements MemberService {
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {return instance;}
	private MemberServiceImpl() {}
	
	
/*	MemberDAO dao ;
	int count;*/
/*	
	}*/
	@Override
	public void createUser(UserBean member) {
		
		System.out.println("====멤버 서비스 ====");
		System.out.println("컨트롤러에서 넘어온 객체 :"+member);
		((UserBean) member).setCreditRating("7등급");
		MemberDAOImpl.getInstance().insertMember(member);  //★★★★
		
	}
	@Override
	public String login(UserBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePassword(MemberBean member) {  
		/*String id = member.getUid();
		String oldPass = member.getPw().split("/")[0];
		String newPass = member.getPw().split("/")[1];
		MemberBean mem = map.get(member.getUid());
		if(mem == null) {
			System.out.println("수정하려는 ID가 없음!");
		}else {
			if(oldPass.equals(mem.getPw())) {
				mem.setPw(newPass);
				map.put(id, mem);
			}
		}*/
	}
	@Override
	public void deleteMember(MemberBean member) {
		//map.remove(member.getUid());
	}
}
