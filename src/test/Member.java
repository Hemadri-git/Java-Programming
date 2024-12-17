package test;

public class Member {
	
	private int memberId;
	private String memberName;
	private String membershipType;
	
	private Book book;
	
	public Member(int memberId, String memberName, String membershipType, Book book) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipType = membershipType;
		this.book = book;
	}
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", membershipType=" + membershipType
				+ ", book=" + book + "]";
	}

	
	public static void main(String[] args) {
		Book book = new Book(12, "5Am Club", "robin");
		Member member = new Member(1, "Hema", "Gold", book);
		System.out.println(member);
	}
	
	
	
	

}
