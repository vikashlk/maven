package Practice2;

import java.util.Scanner;

public class EVENorODD {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to be check even or odd");
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println(num+" is even");
		}else{
			System.out.println(num+"  is odd");
		}
	}

}
