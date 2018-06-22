package repository;

import java.util.List;

import domain.MemberBean;

public interface MemberDAO {
	public void insertMember(MemberBean member);
	public List<MemberBean> selectMemberList();
	public List<MemberBean> selectMemberByName(String name);
	public MemberBean selectMemberByID(String id);
	public MemberBean login(MemberBean member);
	public int countMembers();
	public void updateMember(MemberBean member);
	public void deleteMember(MemberBean member);
	

}
