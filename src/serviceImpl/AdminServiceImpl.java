package serviceImpl;
import java.util.*;
import domain.*;
import service.*;

public class AdminServiceImpl implements AdminService {
	private static AdminService instance = new AdminServiceImpl();
	public static AdminService getInstance() {return instance;}
	private AdminServiceImpl() {}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		//map.put(staff.getUid(),staff);
	}

	@Override
	public List<MemberBean> memberList() {
		return null;
	}

	@Override
	public List<MemberBean> findMemberByName(String name) {
		/*List<MemberBean> temp = new ArrayList<>();
		for(MemberBean e :mlist) {
			if(name.equals(e.getName())) {
				temp.add(e);
			}
		}*/
		return null;
	}

	@Override
	public MemberBean findMemberById(MemberBean member) {
		System.out.println("찾는 아이디에 해당하는 이름 : "+member.getUid());
		return member;  //
	}

	@Override
	public List<AccountBean> accountList() {
		return null;
	}

	@Override
	public List<AccountBean> findAccountByName(String name) {
		List<AccountBean> temp = new ArrayList<>();
		/*for(AccountBean e :alist) {
			if(name.equals(e.getName())) {
				temp.add(e);
			}
		}*/
		return temp;
	}

}
