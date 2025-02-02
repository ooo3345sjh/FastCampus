package ch14;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : 쌍(pair)으로 자료를 관리하는 Map 인터페이스를 구현한 클래스와 그 활용
 * 		 - HashMap 클래스
 */
import java.util.*;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		if(hashMap.isEmpty()) {
			System.out.println("출력할 Member가 없습니다.");
			return;
		}
		
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int memberId = ir.next();
			System.out.println(hashMap.get(memberId));
		}
		System.out.println();
	}

}
