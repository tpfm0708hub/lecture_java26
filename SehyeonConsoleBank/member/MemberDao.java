package member;

import java.util.List;

public interface MemberDao {
	boolean insertMember(Member m);
	List<Member> SelectAll();
	Member selectByID(String id);
	boolean updateMember(Member m, String password);
	boolean deleteMameber(Member m, String password);
}
