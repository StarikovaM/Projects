
import java.util.Scanner;
public class task6_6 {public static void main(String[ ] args) 
{int v;
String s="";
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter n");
	int n= scan.nextInt();
	for(int i=0; i<n; i++)
	{ v=scan.nextInt(); if(v>999&v<10000)
	{if (v/1000+(v%1000/100)==(v%1000%100/10)+(v%1000%100%10))
		s=s+v+" ";} else System.out.println("Число не является четырехзначным");
	}
	System.out.println(s);
	scan.close();
}

}
