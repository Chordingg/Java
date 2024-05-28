package ex01;

class Outer{
	private static int num = 0;	// 정보 은닉
	
	private int age = 10; // static 클래스에서 사용 안됌, 클래스 생성해야 사용 가능 ex) Outer ot = new Outer();
	
	static class Nested1{	// 정적중첩클래스
		void add(int n) {	// Outer 클래스의 static 변수 공유 
			num += n;
			// age = 100; X 
		}
	}
	
	static class Nested2{	 
		int get() {
			return num;
		}
	}
	
	int getAge() {
		return age;
	}
	
}

public class StaticNested {	// public class는 1개만 가능
							// Static 네스티드 클래스는 static 선언이 갖는 특성이 반영된 클래스이다. 
							// 따라서 자신을 감싸는 외부 클래스의 인스턴스와 상관없이 Static 네스티드 클래스의 인스턴스 생성이 가능하다.

	public static void main(String[] args) {
		
		Outer.Nested1 nest1 = new Outer.Nested1();
		nest1.add(5);
		
		Outer.Nested2 nest2 = new Outer.Nested2();
		
		System.out.println(nest2.get());
		
		System.out.println("==============");
		System.out.println(new Outer().getAge());

	}
}