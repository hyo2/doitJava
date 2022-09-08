package collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {

		// Set은 get(i) 안 됨 => iterator로 순회해야함
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			if( memberId == tempId ) {
				treeSet.remove(member);
				return true;
			}
		}
		
		// 여기까지 온 거면 순회가 끝나고도 일치하는 것이 없다는 뜻
		System.out.println(memberId +"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member: treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
