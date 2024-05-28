package ex07;

import java.util.function.Supplier;

@FunctionalInterface
interface EmptyArr {
	int[] emptyArr();
}

public class Exam06 {
	
	public static void main(String[] args) {
		
		EmptyArr em = () -> new int[] {};
		
		int[] ar = em.emptyArr();
		
		System.out.println(ar);
		
		System.out.println("----------------------");
		
		Supplier<int[]> s = () -> new int[] {};
		
		System.out.println(s.get());
	}
}