package ex06;

interface Square{
	int square(int x);
}

public class Exam03 {
	
	public static void main(String[] args) {
		
		Square square = new Square() {
			
			@Override
			public int square(int x) {
				
				return x*x;
			}
		};
		
		System.out.println(square.square(5));
	}
}