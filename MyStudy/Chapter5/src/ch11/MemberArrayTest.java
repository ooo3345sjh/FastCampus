package ch11;

/*
 * 날짜 : 2022-08-21
 * 이름 : 서정현
 * 내용 : Collection 요소를 순회하는 Iterator
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
