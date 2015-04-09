import java.util.Scanner;

public class task6_1 {
	public static void main(String[ ] args) 
	
	{int v;
		int n;
		System.out.println("Enter n");
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	String even="";
	String uneven="";
	for (int i=0; i<n; i++)
	{ v=scan.nextInt();
	if (v%2==0) even=even+" "+v; else uneven=uneven+" "+v;

		
	}
	System.out.println("even: "+even);
	System.out.println("uneven: "+uneven);
	scan.close();
	}}	
