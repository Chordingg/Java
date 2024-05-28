package ex06;

interface PrintVariable{
	void printvar(String name, int i);
	
}

public class Exam02 {
	
	public static void main(String[] args) {
		
		// 익명 객체...
		PrintVariable result = new PrintVariable() {

			@Override
			public void printvar(String name, int i) {
				
				System.out.println(name + "=" + i);
			}
		};
		
		result.printvar("짱구", 6);
	}
}