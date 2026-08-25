package DaoPractice;

public class OracleDao implements DataAccessObject{
	private String name = "Oracle";
	
	public void select() {
		System.out.println(name + "DB에서 검색");
	};
	public void insert() {
		System.out.println(name + "DB에 삽입");
	};
	public void update() {
		System.out.println(name + "DB를 수정");
	};
	public void delete() {
		System.out.println(name + "DB에서 삭제");
	};
}
