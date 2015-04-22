import java.util.Scanner;


public class Task2_9_7 {
	public static void main(String[]args) {
		System.out.println("Сколько целых чисел вы собираетесь ввести? ");
	    Scanner scan = new Scanner(System.in);
	    int colvo_chisel = scan.nextInt();
	    if (colvo_chisel  == 0) {
	        System.out.print("Программа завершена.");
	        System.exit(0);}
	       int [][] mas=new int[colvo_chisel][colvo_chisel];
	       for(int i=0; i<colvo_chisel; i++,System.out.println()){
	        	for(int j=0; j<colvo_chisel;j++)   {
	        		mas[i][j]=(int)(Math.random()*colvo_chisel);
	        		System.out.print(mas[i][j]+" ");
	        	}}
	      // System.out.println(" ");
	       for(int i=colvo_chisel; i<colvo_chisel-1; i++,System.out.println()){
	        	for(int j=0; j<colvo_chisel;j++) {
	        		if(mas[i][j]==0)
	        		{	mas[i][j]=mas[i+1][j];
	        		
	        		}	        	}	
	        		}
	       for(int i=0; i<colvo_chisel; i++,System.out.println()){
	        	for(int j=colvo_chisel; j<colvo_chisel-1;j++) {
	        		if(mas[i][j]==0)
	        		{	mas[i][j]=mas[i][j+1];
	        		}}
	        	}
	       for(int i=0; i<colvo_chisel; i++,System.out.println()){
	        	for(int j=0; j<colvo_chisel;j++)    {
	        		System.out.print(mas[i][j]+" ");
	        	}}
	       System.out.println(" ");
	       }
}
