package serviceImpl;

import java.util.List;
import java.util.ArrayList;
import domain.MemberBean;
import domain.StaffBean;
import domain.UserBean;
import service.MemberService;
	
public class MemberServiceImpl implements MemberService {
	List<MemberBean> list;
	
	public MemberServiceImpl() {
		list = new ArrayList<>(); //뒤쪽 생략가능
	}
	@Override
	public void createUser(UserBean user) {
		user.setCreditRating("7등급");
		//배열일때 할당연산자(=) 넣었음. list[count]=user; 좋지않음
		
							//String res = "";
							//boolean flag = ;
							/*if(list.add(user)) {
								res="등록성공";
							}else {
								res="등록실패";
							}*/

		System.out.println("실행결과: "
		+ ((list.add(user)) ? "등록성공" : "등록실패"));
	}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		System.out.println("실행결과: "
		+ ((list.add(staff)) ? "등록성공" : "등록실패"));
		
	}

	@Override
	public List<MemberBean> list() {
		return list;
	}

	@Override
	public List<MemberBean> search(String param) {
		List<MemberBean> temp = new ArrayList<>();  //뒤에 동일한 <>값은 생략가능
	
		for(int i=0;i<list.size();i++) {  //size() =>데이터양에 따라 칸이 증식=> 최적의 횟수만 돈다.
			if(param.equals(list.get(i).getName())) {   //list[i]  =list.get(i)   
				temp.add(list.get(i));
			}
		}
		return temp;
	}

	@Override
	public MemberBean search(MemberBean member) {
	MemberBean dap = new MemberBean();
		
		for(int i=0;i<list.size();i++) {  //size() =>데이터양에 따라 칸이 증식=> 최적의 횟수만 돈다.
			if(member.getUid().equals(list.get(i).getUid())) {   //list[i]  =list.get(i)   
				dap = list.get(i);
				break;
			}
		}
		return dap;
	}

	@Override
	public void update(MemberBean member) {  
		list.get(list.indexOf(search(member))).setPw(member.getPw());  //★★★★
	}

	@Override
	public void delete(MemberBean member) {
		list.remove(list.indexOf(search(member)));
		//list.remove(search(member));
		//search(member) 로 써야돼?? member 쓰면 안돼?
	}
}
