import java.util.Scanner;


public class Task1_6_5 {
	public static void main(String[]args) {
		System.out.println("������� ����� ����� �� ����������� ������? ");
	    Scanner scan = new Scanner(System.in);
	    int colvo_chisel = scan.nextInt();
	    if (colvo_chisel  == 0) {
	        System.out.print("��������� ���������.");
	        System.exit(0);}
	    System.out.println("������� ����� � ������� <Enter>:");
	    for(int i=0; i<colvo_chisel;i++)
	    	{ String chislo=scan.next();
	    	if(chislo.length()==3 & (chislo.charAt(0)==chislo.charAt(1))|(chislo.charAt(1)==chislo.charAt(2))| (chislo.charAt(0)==chislo.charAt(2)))
	    			 System.out.println("����� , � ���������� ������ �������� ���� ���������� ����� ");
	    	else System.out.println("�����, � ���������� ������ �������� ��� ���������� ���� ");
	    	}
		
	}}
