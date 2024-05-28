package ex06;

interface Roll{
	int roll();
}

public class Exam04 {
	
	public static void main(String[] args) {
		
		Roll ro = new Roll() {
			
			@Override
			public int roll() {
				
				return (int)(Math.random() * 6);
			}
		};
		
		System.out.println(ro.roll()); 
	}
}