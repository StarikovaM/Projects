
public class Task1_5 {
	public static void main(String[]args) {
		int sum=0, proizv=1;
		for(int j=0; j<args.length; j++)
		{	int privtip=Integer.parseInt(args[j]);
		sum=sum+privtip;
		proizv=proizv*privtip;}
			System.out.println("Summa"+" "+"="+sum);
			System.out.println("Proizvidenie"+" "+"="+proizv);
		
	}
}
