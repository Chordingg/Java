package ex06;

interface SumArr{
	int sumArr(int[] arr);
}

public class Exam05 {
	
	public static void main(String[] args) {
		
		SumArr sumarr= new SumArr() {
			
			int sum = 0;

			@Override
			public int sumArr(int[] arr) {
				
				 for(int i : arr) 

				      sum += i;

				   return sum;
			}
		};
		int[] Arr = {1,2,3,4,5};
		int result = sumarr.sumArr(Arr);
		System.out.println(result);
	}
}