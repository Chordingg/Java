package ex07;

import java.util.function.BiFunction;

@FunctionalInterface
interface MaxA {
	int max(int a, int b);
}

public class Exam01 {

	public static void main(String[] args) {

		/*
		 람다...
		 매개변수 자료형 삭제 가능
		 반환 타입 있는 경우 -> {} 안에 return 기입
		 반환 타입 있는 경우 -> {} 없으면 return 생략
		*/
		MaxA result = (a, b) -> a > b ? a : b;
		
		//메소드 참조
		MaxA result2 = Integer::max;

		System.out.println(result.max(10, 30));

		System.out.println(result2.max(5, 3));
		
		System.out.println("-------------------");
		
		// 인자값 두개라서 BiFunction 사용
		BiFunction<Integer, Integer, Integer> bf = (a, b) -> a > b ? a : b;
		System.out.println(bf.apply(50, 10));
	}
}