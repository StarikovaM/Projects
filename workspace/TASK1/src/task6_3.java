import java.util.Scanner;
public class task6_3 {public static void main(String[ ] args) 
{int v;
String s="";
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter n");
	int n= scan.nextInt();
	for(int i=0; i<n; i++)
	{ v=scan.nextInt();
	if (v%3==0|v%9==0)
	s=s+v+" ";
	}
System.out.println(s);
scan.close();
}

}
