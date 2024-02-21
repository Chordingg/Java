import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int yoonYear;
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			yoonYear = 1;
			System.out.println(yoonYear);
		} else {
			yoonYear = 0;
			System.out.println(yoonYear);
		}
		
	}

}
