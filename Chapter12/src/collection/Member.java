package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member>{

	private int memberId;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		
		return memberName + " 회원님의 아이디는 " + memberId+"입니다.";
	}

	@Override
	public int hashCode() {
		// 같은 놈일 경우에 같은 memberId를 반환함
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return super.equals(obj);
	}

	@Override
	public int compareTo(Member member) {
		
		// Id로 비교=> return (this.memberId - member.memberId)
		// 뺐을 때, 내가 더 큰 경우 양수를 반환하면: 오름차순으로 트리 정렬됨
		// 얘네 두개를 뒤집으면 내림차순으로 정렬됨(=원래꺼에서 음수로 리턴되면(*(-1)) 내림차순 됨)
		
		// Name으로 비교(오름차순 뒤집으러면(내림차순으로 바꾸려면) *(-1)
		return (this.memberName.compareTo(member.memberName));
	}

	@Override
	public int compare(Member member1, Member member2) {
		// 오름차순
		return (member1.memberId - member2.memberId);
	}
	
	
}
