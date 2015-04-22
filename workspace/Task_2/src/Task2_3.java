import java.util.Scanner;


public class Task2_3 {
	public static void main(String[]args) {
		System.out.println("Сколько целых чисел вы собираетесь ввести? ");
	    Scanner scan = new Scanner(System.in);
	    int colvo_chisel = scan.nextInt();
	    if (colvo_chisel  == 0) {
	        System.out.print("Программа завершена.");
	        System.exit(0);}
	    System.out.println("введите числа и нажмите <Enter>:");
	       String chislo1="", chislo2="";  
	       int sum=0;
	       Integer [] mas=new Integer[colvo_chisel];
	        for(int i=0; i<colvo_chisel; i++)
	        	{chislo1=scan.next();
	        	sum=sum+chislo1.length();
	        	chislo2=String.valueOf(chislo1);
	        	Integer k=Integer.valueOf(chislo2);
	        	mas[i]=k;}
	        for(int j=0;j<colvo_chisel;j++){
	        	String str=String.valueOf(mas[j]);
	        	if(str.length()<sum/colvo_chisel){
	        		System.out.println("Stroka: "+ str);
	        		System.out.println("dlina: "+ str.length());
	    	}
	    	}}
}
