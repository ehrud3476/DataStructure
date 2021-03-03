import java.util.Scanner;

public class BasicList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] a1 = new int[5];
		
		for (int i = 0 ; i < a1.length; i++) {			
			a1[i] = sc.nextInt();
		}
		for(int a: a1) {
			System.out.println(a);
		}
	}

}
