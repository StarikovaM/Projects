import java.util.Scanner;


public class Task1_6_5 {
	public static void main(String[]args) {
		System.out.println("Сколько целых чисел вы собираетесь ввести? ");
	    Scanner scan = new Scanner(System.in);
	    int colvo_chisel = scan.nextInt();
	    if (colvo_chisel  == 0) {
	        System.out.print("Программа завершена.");
	        System.exit(0);}
	    System.out.println("введите числа и нажмите <Enter>:");
	    for(int i=0; i<colvo_chisel;i++)
	    	{ String chislo=scan.next();
	    	if(chislo.length()==3 & (chislo.charAt(0)==chislo.charAt(1))|(chislo.charAt(1)==chislo.charAt(2))| (chislo.charAt(0)==chislo.charAt(2)))
	    			 System.out.println("число , в десятичной записи которого есть одинаковые цифры ");
	    	else System.out.println("число, в десятичной записи которого нет одинаковых цифр ");
	    	}
		
	}}
