package rutik;
import java.util.*;
public class ArrayAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no = 0, sum = 0, ave = 0;
		System.out.println("Enter the Size of Element :");
		no = sc.nextInt();
		
		int[] arr = new int[no];
		
		System.out.println("Enter Array  Element :");
		for(int i = 0; i < no; i++)
		{
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
			
			ave = sum / arr.length;
		}
		System.out.println(ave);
		
		}
}
