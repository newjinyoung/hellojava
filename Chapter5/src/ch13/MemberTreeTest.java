package ch13;

import java.util.TreeSet;

public class MemberTreeTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("홍길동");
		set.add("강감찬");
		set.add("이순신");
		
		System.out.println(set);

		Member memberHong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		
		memberTreeSet.showAllMember();
		

		/*memberTreeSet.showAllMember();*/

		
	}

}
