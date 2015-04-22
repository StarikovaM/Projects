import java.util.Scanner;


public class Task2_1 {
	public static void main(String[]args) {
	System.out.println("Сколько целых чисел вы собираетесь ввести? ");
    Scanner scan = new Scanner(System.in);
    int colvo_chisel = scan.nextInt();
    if (colvo_chisel  == 0) {
        System.out.print("Программа завершена.");
        System.exit(0);}
    System.out.println("введите числа и нажмите <Enter>:");
    int maxcount=0, mincount=100;
    String count1="", count2="";
    String chislo="";    
    for(int i=0; i<colvo_chisel; i++)
    	{chislo=scan.next();
    	//String chislo=Integer.toString(chislo1);
    	if(chislo.length()>maxcount)	
    		{maxcount=chislo.length();
    	count1=chislo;}
    	else if(chislo.length()<mincount)
    	{
    		mincount=chislo.length();
    		count2=chislo;
    	}
	}
    System.out.println(" longest "+count1+" dlina-"+maxcount);
    System.out.println(" shortest "+count2+" dlina-"+mincount);
    
    }
}
