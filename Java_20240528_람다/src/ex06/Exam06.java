package ex06;

interface EmptyArr {
	int[] emptyArr();
}

public class Exam06 {
	
	public static void main(String[] args) {
		
		EmptyArr em = new EmptyArr() {

			@Override
			public int[] emptyArr() {
				
				return new int[] {};
				}
			};
		
		int[] ar = em.emptyArr();
		System.out.println(ar);
	}
}