package ch10;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : 순차적으로 자료를 관리하는 List 인터페이스를 구현한 클래스와 그 활용
 */
public class Member {
	private int memberId; //회원 아이디
	private String memberName; //회원 이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}
	
	
}
