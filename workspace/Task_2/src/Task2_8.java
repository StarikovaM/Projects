import java.util.Scanner;


public class Task2_8 {
	public static void main(String[]args) {
		System.out.println("Сколько целых чисел вы собираетесь ввести? ");
	    Scanner scan = new Scanner(System.in);
	    int colvo_chisel = scan.nextInt();
	    if (colvo_chisel  == 0) {
	        System.out.print("Программа завершена.");
	        System.exit(0);}
	    Integer [][] mas=new Integer[colvo_chisel][colvo_chisel];	   
	    int k=1;	   
	    for(int i=0; i<colvo_chisel; i++)
	    	for(int j=0; j<colvo_chisel;j++)	    	
	    		mas[i][j]=k++;
	    for(int i=0; i<colvo_chisel; i++)
	    	{for(int j=0; j<colvo_chisel;j++)	
	    		System.out.print(mas[i][j]+" ");
	    	System.out.println(" ");
	    		
	    	}
	    	}   
	

}
