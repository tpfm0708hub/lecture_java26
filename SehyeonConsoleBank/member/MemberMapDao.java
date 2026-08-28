package member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberMapDao implements MemberDao{
	
	Map<String, Member> memberDB = new HashMap<>();

	@Override
	public boolean insertMember(Member m) {
		memberDB.put(m.getId(), m);
		return false;
	}

	@Override
	public List<Member> SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateMember(Member m, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMameber(Member m, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
