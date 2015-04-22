import java.util.Scanner;


public class Task2_9 {
	public static void main(String[]args) {
		System.out.println("Сколько целых чисел вы собираетесь ввести? ");
	    Scanner scan = new Scanner(System.in);
	    int colvo_chisel = scan.nextInt();
	    if (colvo_chisel  == 0) {
	        System.out.print("Программа завершена.");
	        System.exit(0);}
	    Integer [][] mas=new Integer[colvo_chisel][colvo_chisel];
	    for(int i=0; i<mas.length; i++,System.out.println())
	    	for(int j=0; j<mas[i].length;j++)
	    	{
	    		mas[i][j]=(int)(Math.random()*colvo_chisel);
	    		System.out.print(mas[i][j]+" ");
	    	
	    	}
	    
	}
}
