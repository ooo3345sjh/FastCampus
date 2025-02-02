package ch13;

import java.util.*;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : 정렬을 위해 Comparable과 Comparator 인터페이스 구현하기
 * 
 *		※TreeSet 클래스 활용하기
 *		- 객체의 정렬에 사용하는 클래스
 *		- Set 인터페이스를 구현하여 중복을 허용하지 않고, 오름차순이나 내림차순으로 객체를 정렬할 수 있음
 *		- 내부적으로 이진검색트리(binary search tree)로 구현됨
 *		- 이진검색트리에 저장하기 위해 각 객체를 비교해야 함
 * 		- 비교 대상이 되는 객체에 Comparable이나 Comparator 인터페이스를 구현 해야 TreeSet에 추가 될 수 있음
 *		- String, Integer등 JDK의 많은 클래스들이 이미 Comparable을 구현했음
 */
public class Member implements Comparator<Member> {
	private int memberId; //회원 아이디
	private String memberName; //회원 이름
	
	public Member() {}
	
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
/*
	@Override
	public int compareTo(Member member) {
		
		//방법1
		if(this.memberId > member.memberId) 
			return 1;
		else if(this.memberId < member.memberId) 
			return -1;
		else return 0;
		
		//방법2
		//return this.memberId - member.memberId 오름차순
		//return (this.memberId - member.memberId) * -1 내림차순
	}
*/
	
	//Comparator는 Interface타입으로, 구현되어있는 compare(T o1, T o2)메서드를 구현해주어야한다.
	@Override
	public int compare(Member o1, Member o2) {
		return o1.memberId - o2.memberId;
	}
	
	
	
	
}
