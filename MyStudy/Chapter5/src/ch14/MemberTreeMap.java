package ch14;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : 쌍(pair)으로 자료를 관리하는 Map 인터페이스를 구현한 클래스와 그 활용
 * 		 - TreeMap 클래스
 */
import java.util.*;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>(new MyKey());
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		if(treeMap.isEmpty()) {
			System.out.println("출력할 Member가 없습니다.");
			return;
		}
		
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int memberId = ir.next();
			System.out.println(treeMap.get(memberId));
		}
		System.out.println();
	}

}
