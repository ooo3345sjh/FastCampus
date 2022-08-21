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
public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet mSet = new MemberTreeSet();
		Member memberLee = new Member(1000, "Lee");
		Member memberKim = new Member(1001, "Kim");
		Member memberSeo = new Member(1002, "Seo");
		
		Member memberJoo1 = new Member(1003, "Joo1"); 
		Member memberJoo2 = new Member(1003, "Joo2");
		
		mSet.addMember(memberLee);
		mSet.addMember(memberKim);
		mSet.addMember(memberSeo);
		
		mSet.addMember(memberJoo1);
		mSet.addMember(memberJoo2);
		
		mSet.showAllMember();
	}
}
