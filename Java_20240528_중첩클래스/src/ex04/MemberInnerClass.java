package ex04;

class Outer{
	private int num = 10;
	
	int get() {
		return num;
	}
	
	class Member{
		void add(int num) {
			Outer.this.num = num;
		}
		
		int get() {
			return num*2;
		}
	}
}

public class MemberInnerClass {
	
	public static void main(String[] args) {
		
		Outer ot1 = new Outer();
		System.out.println(ot1.get());	// 10
		
		Outer.Member ot2 = ot1.new Member();
		int num = ot2.get();
		System.out.println(num);	// 20
		
		Outer.Member ot3 = new Outer().new Member();
		System.out.println(ot3.get());
	}

}
