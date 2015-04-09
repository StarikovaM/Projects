
import java.util.Scanner;
public class task6_7 {public static void main(String[ ] args) 
{

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter n");
	 
	int n= scan.nextInt();
	int nums[]= new int[n]; 
	for(int i = 0; i < n; i++)   
		nums[i]=scan.nextInt();
	
	
	for(int i=1; i<n-1; i++)
	if (nums[i]==(nums[i-1]+nums[i+1])/2)
		System.out.println(nums[i]);
	
	scan.close();
}

}