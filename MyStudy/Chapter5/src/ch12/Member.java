package ch12;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : Collection 요소를 순회하는 Iterator
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
	
	
	//아이디가 동일한 경우 같은 멤버이므로 중복되지 않도록, 
	//Member 클래스의 equals()와 hashCode()메서드를 재정의함
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(memberId == member.getMemberId()) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
