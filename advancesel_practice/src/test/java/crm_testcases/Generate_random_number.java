package crm_testcases;

import java.util.Random;

public class Generate_random_number {
 public static void main(String[] args) {
		
		
		//generating random number
		Random random=new Random();
		int ranInt = random.nextInt(1000);
		System.out.println(ranInt);
		
	}
}
