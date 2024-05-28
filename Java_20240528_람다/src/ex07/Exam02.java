package ex07;

import java.util.function.BiConsumer;

@FunctionalInterface
interface PrintVariable{
	void printvar(String name, int i);
	
}

public class Exam02 {
	
	public static void main(String[] args) {
		
		// 익명 객체...
		PrintVariable result = (name, i) -> {
				
				System.out.println(name + "=" + i);
		};
		
		result.printvar("짱구", 6);
		
		System.out.println("-------------------------");
		
		BiConsumer<String, Integer> bc = (name, i) -> System.out.println(name + "=" + i);
		bc.accept("로이", 13);
	}
}