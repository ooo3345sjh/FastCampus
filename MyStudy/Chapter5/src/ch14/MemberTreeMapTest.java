package ch14;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : 쌍(pair)으로 자료를 관리하는 Map 인터페이스를 구현한 클래스와 그 활용
 * 		 - TreeMap 클래스
 */
public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap mMap = new MemberTreeMap();
		Member memberLee = new Member(1000, "Lee");
		Member memberKim = new Member(1001, "Kim");
		Member memberSeo = new Member(1002, "Seo");
		
		Member memberJoo1 = new Member(1003, "Joo1"); 
		Member memberJoo2 = new Member(1003, "Joo2");
		
		mMap.addMember(memberLee);
		mMap.addMember(memberKim);
		mMap.addMember(memberSeo);
		mMap.addMember(memberJoo1);
		mMap.addMember(memberJoo2);
		
		mMap.showAllMember();
		
		
	}
}
