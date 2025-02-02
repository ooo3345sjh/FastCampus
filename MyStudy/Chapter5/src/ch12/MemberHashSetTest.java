package ch12;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : 중복되지 않게 자료를 관리하는 Set 인터페이스를 구현한 클래스와 그 활용
 */
public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet mSet = new MemberHashSet();
		Member memberLee = new Member(1000, "Lee");
		Member memberKim = new Member(1001, "Kim");
		Member memberSeo = new Member(1002, "Seo");
		
		//학번이 동일한 객체 생성
		Member memberJoo1 = new Member(1003, "Joo1"); 
		Member memberJoo2 = new Member(1003, "Joo2");
		
		mSet.addMember(memberLee);
		mSet.addMember(memberKim);
		mSet.addMember(memberSeo);
		
		//HashSet에 객체 추가를 해도 두 객체는 학번이 동일하므로
		//동일한 객체로 인식하여 memberJoo1객체만 추가되고 
		//memberJoo2객체는 중복으로 추가되지않음.
		mSet.addMember(memberJoo1);
		mSet.addMember(memberJoo2);
		
		mSet.showAllMember();
	}
}
