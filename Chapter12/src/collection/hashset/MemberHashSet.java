package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {

		// Set은 get(i) 안 됨 => iterator로 순회해야함
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			if( memberId == tempId ) {
				hashSet.remove(member);
				return true;
			}
		}
		
		// 여기까지 온 거면 순회가 끝나고도 일치하는 것이 없다는 뜻
		System.out.println(memberId +"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member: hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
