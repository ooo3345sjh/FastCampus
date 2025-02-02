package ch10;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : 순차적으로 자료를 관리하는 List 인터페이스를 구현한 클래스와 그 활용
 */
import java.util.*;

public class MemberArrayList {
	
	ArrayList<Member> memberArray;
	
	public MemberArrayList() {
		memberArray = new ArrayList<>();
	}
	
	public MemberArrayList(int size) {
		memberArray = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		memberArray.add(member);
	}
	
	public boolean removeMember(Member member) {
		
		for(int i=0; i<memberArray.size(); i++) {
			
			int memberId = memberArray.get(i).getMemberId();
			if(memberId == member.getMemberId()) {
				memberArray.remove(i);
				return true;
			}
		}
		System.out.println(member.getMemberId() + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : memberArray) {
			System.out.println(member);
		}
		System.out.println();
	}

}
