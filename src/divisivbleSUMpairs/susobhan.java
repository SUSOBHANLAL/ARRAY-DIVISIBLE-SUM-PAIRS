package divisivbleSUMpairs;
import java.util.*;
public class susobhan {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr [] = new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int sum = 0;int count = 0;
		for(int i =0;i<n;i++) {
			sum =0;
			for(int j=i+1;j<n;j++) {
				sum= arr[i]+arr[j];
				if(sum%k==0) {
					count++;
				}
			}
		}
		
		System.out.print(count);
		
	}
	
	
		
	

}
