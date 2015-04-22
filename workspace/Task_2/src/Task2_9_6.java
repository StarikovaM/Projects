import java.util.Scanner;


public class Task2_9_6 
{
	public static void main(String[]args) {
	System.out.println("Сколько целых чисел вы собираетесь ввести? ");
    Scanner scan = new Scanner(System.in);
    int colvo_chisel = scan.nextInt();
    if (colvo_chisel  == 0) {
        System.out.print("Программа завершена.");
        System.exit(0);}
       double [][] mas=new double[colvo_chisel][colvo_chisel];
    double [] Sum=new double[colvo_chisel];
    for(int i=0; i<colvo_chisel; i++,System.out.println())
        	for(int j=0; j<colvo_chisel;j++)    	{
    		mas[i][j]=colvo_chisel+(int)(Math.random()*colvo_chisel);;    			   		
    	}
    for(int l=0; l<colvo_chisel; l++,System.out.println()){
    	for(int j=0; j<colvo_chisel;j++)
    	{
       	System.out.print(mas[l][j]+" ");
    	} System.out.println(" ");}
    for(int l=0; l<colvo_chisel; l++,System.out.println())
    	for(int j=0; j<colvo_chisel;j++){
    		Sum[l]+=mas[l][j];
    	}
    System.out.println(" ");
    System.out.println(" ");
    for(int l=0; l<colvo_chisel; l++,System.out.println()){
    	for(int j=0; j<colvo_chisel;j++)
    	{
    		System.out.print(mas[l][j]-Math.abs(Sum[l]/colvo_chisel)+" ");
    	}
System.out.println();
    }
    scan.close();
}}
