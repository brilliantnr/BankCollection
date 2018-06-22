package service;

import java.util.List;
import domain.*;

public interface AdminService {
	public void createStaff(StaffBean staff);
	public List<MemberBean> memberList();
	public List<MemberBean> findMemberByName(String name); //searchSome  
	public MemberBean findMemberById(MemberBean member); //searchOne
	
	public List<AccountBean> accountList();
	public List<AccountBean> findAccountByName(String name);
}
