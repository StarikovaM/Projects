import java.util.Scanner;


public class Task1_6_7 {
	public static void main(String[]args) {
		System.out.println("������� ����� ����� �� ����������� ������? ");
	    Scanner scan = new Scanner(System.in);
	    int colvo_chisel = scan.nextInt();
	    if (colvo_chisel  == 0) {
	        System.out.print("��������� ���������.");
	        System.exit(0);}
	    System.out.println("������� ����� � ������� <Enter>:");	    
	    Integer [] mas_chisla=new Integer[colvo_chisel];
	    for(int j=0; j<mas_chisla.length;j++)
	    { mas_chisla[j]=scan.nextInt();}
	    for(int i=1; i<mas_chisla.length-1;i++)
	    	  	if(mas_chisla[i]==((mas_chisla[i-1]+mas_chisla[i+1])/2))
	    		System.out.println(mas_chisla[i]);
	    	}
	}
	


