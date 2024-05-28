package ex07;

import java.util.function.Function;

@FunctionalInterface
interface Square{
	int square(int x);
}

public class Exam03 {
	
	public static void main(String[] args) {
		
		Square sq = x -> x*x;
		
		System.out.println(sq.square(5));	
		
		System.out.println("-----------------------------");
		
		Function<Integer, Integer> a = (b) -> b*b;
		
		System.out.println(a.apply(5));		
		
		
	}
}