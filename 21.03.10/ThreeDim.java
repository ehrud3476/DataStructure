package main;

public class ThreeDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sale [][][] = new int [][][] {{{1,2,3,4},{5,6,7,8}},{{112,114,119,502},{345,878,564,321}}};
		for(int i =0;i<2;i++) {
			System.out.printf("<< %d ÆÀ >> %n", i+1);
			for(int j=0;j<2;j++) {
				for(int k =0;k<4;k++)
					System.out.printf("%d/4ºÐ±â : sale [%d][%d][%d] = %d%n", k+1,i,k,k,sale[i][j][k]);
				System.out.println("-----------------------------");
			}
			System.out.println();
		}
	}

}
