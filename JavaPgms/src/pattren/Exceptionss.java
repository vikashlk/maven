package pattren;

public class Exceptionss {

	public static void main(String[] args) {
		System.out.println("main starts ");
		try{
			int a=10;
			int b=2;
			int c=a/b;
			int[] arr={20,30,40,10};
			

				System.out.println(arr[c]);
			}
			catch(IndexOutOfBoundsException in)
			{
				System.out.println("caught index");
			}
		 finally
		{
			System.out.println(" finally block i am");
		}System.out.println("main ends");
	}

}
