package member;

import java.util.List;

public class MemberTest {
	public static void main(String[] args) {
		MemberDao mdao = new MemberMapDao();
		
		mdao.insertMember(new Member("aaa", "bbb", "111"));
		List<Member> mlist = mdao.SelectAll();
		for (Member m : mlist)
			System.out.println(m);
	}

}
