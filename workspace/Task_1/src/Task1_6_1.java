import java.util.Scanner;
public class Task1_6_1 {
	public static void main(String[]args) {
		 System.out.print("������� ����� ����� �� ����������� ������? ");
	        Scanner scan = new Scanner(System.in);
	        int colvo_chisel = scan.nextInt();
	        if (colvo_chisel  == 0) {
	            System.out.print("��������� ���������.");
	            System.exit(0);}
	            Integer[] chislo = new Integer[colvo_chisel];
		System.out.println("������� ����� � ������� <Enter>:");		
	for(int i=0; i<colvo_chisel ;i++)
		{ chislo[i]=scan.nextInt();
			if((chislo[i] % 2)==0)
				System.out.println("������");
			
			else 
				System.out.println(" ��������");
		}
	scan.close();
	}}
	
