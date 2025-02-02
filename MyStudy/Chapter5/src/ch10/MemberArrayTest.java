package ch10;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : 순차적으로 자료를 관리하는 List 인터페이스를 구현한 클래스와 그 활용
 */
public class MemberArrayTest {
	public static void main(String[] args) {
		MemberArrayList mList = new MemberArrayList();
		Member memberLee = new Member(1000, "Lee");
		Member memberKim = new Member(1001, "Kim");
		Member memberSeo = new Member(1002, "Seo");
		Member memberJoo = new Member(1003, "Joo");
		
		mList.addMember(memberLee);
		mList.addMember(memberKim);
		mList.addMember(memberSeo);
		mList.addMember(memberJoo);
		
		mList.removeMember(memberKim);
		mList.showAllMember();
	}
}
