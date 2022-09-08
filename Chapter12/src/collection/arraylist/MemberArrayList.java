package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		// for로 전체 순회하기
//		for(int i = 0; i < arrayList.size();i++) {
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			if( memberId == tempId ) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		
		// iterator로 전체 순회하기
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			if( memberId == tempId ) {
				arrayList.remove(member);
				return true;
			}
		}
		
		// 여기까지 온 거면 for 다 끝나고도 일치하는 것이 없다는 뜻
		System.out.println(memberId +"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member: arrayList) {
			System.out.println(member);
		}
		System.out.println();
		// System.out.println(arrayList);
	}
	
}
