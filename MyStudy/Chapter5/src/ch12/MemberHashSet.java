package ch12;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : 중복되지 않게 자료를 관리하는 Set 인터페이스를 구현한 클래스와 그 활용
 */

import java.util.*;

public class MemberHashSet {
	HashSet<Member> memberSet;
		
	public MemberHashSet() {
		memberSet = new HashSet<>();
	}
	
	public void addMember(Member member) {
		memberSet.add(member);
	}
	
	public boolean removeMember(Member member) {
		Iterator<Member> i = memberSet.iterator();
		
		while(i.hasNext()) {
			Member temp = i.next();
			if(temp.getMemberId() == member.getMemberId()) {
				memberSet.remove(member);
				return true;
			}
		}
		
		System.out.println(member.getMemberId() + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : memberSet) {
			System.out.println(member);
		}
		System.out.println();
	}


}
