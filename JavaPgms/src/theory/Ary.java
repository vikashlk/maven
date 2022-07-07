package theory;

import java.util.ArrayList;

public class Ary {

	public static void main(String[] args) {
		ArrayList arr= new ArrayList();
		arr.add(40);
		arr.add(30);
		arr.add(20);
		arr.add(70);
		arr.sort(null);
		System.out.println(arr);
		for (Object o : arr) {
			System.out.println(o);
		}
	}
	

}
