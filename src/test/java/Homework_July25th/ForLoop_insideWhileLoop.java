package Homework_July25th;

public class ForLoop_insideWhileLoop {

	public static void main(String[] args) {
		int sum = 1;
		while(sum<=10) {
			for(int i=0;i<3;i++) {
				sum*=i;
			}
		}
				System.out.println(sum);
	
		

	}

}
