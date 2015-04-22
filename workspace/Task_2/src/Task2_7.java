import java.util.HashSet;
import java.util.Scanner;


public class Task2_7 {public static void main(String[]args) {
	System.out.println("Сколько целых чисел вы собираетесь ввести? ");
	Scanner scan = new Scanner(System.in);
    int colvo_chisel = scan.nextInt();
    if (colvo_chisel  == 0) {
        System.out.print("Программа завершена.");
        System.exit(0);}
	int  diff_numbers=100, difnumsmin=100,min=0; 
    System.out.println("введите числа и нажмите <Enter>:");
    int nums []=new int[colvo_chisel];
    for(int i=0;i<colvo_chisel;i++){
    	nums[i]=scan.nextInt();}
    for(int i=0;i<colvo_chisel;i++){
    	String strNumberIncom=Integer.toString(nums[i]);
    	HashSet <Character>hSet=new HashSet<>();//коллекция в которой не может быть одинаковых коллекций
    	for (int j = 0; j < strNumberIncom.length(); j++) {
    		hSet.add(strNumberIncom.charAt(j));
    		}
    	if(strNumberIncom.length()==hSet.size())
    	{ 
    	min=nums[i]; }
    	
    		}System.out.println(min);
    		scan.close();


    }



}
