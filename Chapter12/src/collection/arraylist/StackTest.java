package collection.arraylist;

import java.util.ArrayList;

class MyStack{

	private ArrayList<String> arrayStack = new ArrayList<String>();
	// 그냥 new ArrayList();라고 해도 묵시적으로 참조되면서 안 써도 컴파일 에러 안 남
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		
		int len = arrayStack.size();
		
		// underflow인지 확인
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return arrayStack.remove(len-1);
	}
	
	public String peek() {
		int len = arrayStack.size();
		
		// underflow인지 확인
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return arrayStack.get(len-1);
	}
}

public class StackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//System.out.println(stack.pop());
		
	}

}
