import java.util.Scanner;
public class task1_3 {
	public static void main(String[ ] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int nums[]= new int[n];
		for (int i=0; i<n; i++)
		{
			nums[i]=1+(int)(Math.random()*(11-1));
			
		}
		for (int i=0; i<n; i++)
		{
			System.out.print(nums[i]+" ");
			
		}
		System.out.println(" ");
		for (int i=0; i<n; i++)
		{
			System.out.println(nums[i]);
			
		}
		
		scan.close();
	}
}
