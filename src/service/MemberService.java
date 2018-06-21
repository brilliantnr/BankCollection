package service;

import java.util.List;
import java.util.Map;
import domain.*;

public interface MemberService {

	public void createUser(UserBean user);
	public void createStaff(StaffBean staff);
	public Map<String,MemberBean> list();
	public int count();
	public List<MemberBean> findByName(String name); //searchSome  
	public MemberBean findById(MemberBean member); //searchOne
	public void updatePassword(MemberBean member);
	public void deleteMember(MemberBean member);
		
	
	
	
}
