package service;

import java.util.List;
import java.util.Map;
import domain.*;

public interface MemberService {

	public void createUser(UserBean member);
	public String login(UserBean member);
	//id존재여부, 비번불일치
	public void updatePassword(MemberBean member);
	public void deleteMember(MemberBean member);
		
	
	
	
}
