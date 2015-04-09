import java.util.Scanner;
public class task6_2 
{public static void main(String[ ] args)

{ System.out.println("Enter n");
	Scanner scan=new Scanner(System.in);
int cmax=0, cmin=0, c;
int n=scan.nextInt();
for (int i=0; i<n; i++)
{c=scan.nextInt();
if(i==0) cmin=c;
else if(c<cmin) cmin=c;
if(c>cmax) cmax=c;
}
System.out.println("Max: "+cmax);
System.out.println("Min: "+cmin);
scan.close();
}
}