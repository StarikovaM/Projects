import java.util.Scanner;
public class task6_5 {public static void main(String[ ] args) 
{int v;
String s="";
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter n");
	int n= scan.nextInt();
	for(int i=0; i<n; i++)
	{ v=scan.nextInt(); if(v>99&v<1000)
	{if (v/100!=(v%100/10)&(v%100/10)!=(v%100%10)&v/100!=(v%100%10))
		s=s+v+" ";} else System.out.println("Число не является трехзначным");
	}
	System.out.println(s);
	scan.close();
}

}