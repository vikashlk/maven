package Practice2;

import java.util.Scanner;

public class Evennum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	for (int i = 0; i <=num;i++) {
		if(i%2==0){
			System.out.println(i+" even number");
		}else{
			System.out.println(i+" odd number");
		}
		
	}
}
}
