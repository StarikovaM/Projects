import java.util.Scanner;


public class Task1_6_6 {
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
	     if(chislo.length()==4 & ((chislo.charAt(0)+ chislo.charAt(1))== (chislo.charAt(2)+ chislo.charAt(3))))
	    		 System.out.println("Счастливое число");
	     else  System.out.println("Обычное число");
	}
	}
}
