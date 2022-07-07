package Practice;

public class Bubble {

	public static void main(String[] args) {
		int[] arr={90,28,38,7,5,31};
		int n=arr.length;
		int temp;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1;j++){
				
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				}
			}
			for(int k=0;k<n;k++){
				System.out.print(arr[k]+" ");
			}
		}
	}

