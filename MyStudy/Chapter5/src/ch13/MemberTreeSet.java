package ch13;

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

import java.util.*;

public class MemberTreeSet {
	TreeSet<Member> memberSet;
	
	public MemberTreeSet() {
		//Comparator구현시 다음과 같이 작성해주어야 한다.
		memberSet = new TreeSet<Member>(new Member()); 
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
