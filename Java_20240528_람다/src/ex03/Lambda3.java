package ex03;

@FunctionalInterface	// 함수형 인터페이스
interface Printable{
	void print(String msg);	// 추상 메소드 1개만 존재
	
	// void print2(); 불가능
	default void print2() {};
	default void print3() {};
	public static void print4() {};
}

class A{
	
}


// 람다를 만들 수 있는 대상은 함수형 인터페이스만 가능(인터페이스 안에 추상메소드가 1개만 존재)
public class Lambda3 {
	
	public static void main(String[] args) {
		
		// 람다식
//		Printable prn = msg ->{
//				System.out.println(msg);
//		};
		
		// 메소드 참조
		Printable prn = System.out::println;
		
		/*
		Printable prn = new Printable() {
			
			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};
		*/
		
		prn.print("출력할 메세지는 Lambda....");
	}
}
