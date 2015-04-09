import java.util.Scanner;
public class Task1_6_2 {
	public static void main(String[]args) {
		System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scan = new Scanner(System.in);
        int colvo_chisel = scan.nextInt();
        if (colvo_chisel  == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);}
            Integer[] chislo = new Integer[colvo_chisel];
          int max=0, min=999; 
	System.out.println("введите числа и нажмите <Enter>:");		
for(int i=0; i<colvo_chisel ;i++)
	{ chislo[i]=scan.nextInt();
	if(max < chislo[i] ) max = chislo[i];
    if (min > chislo[i]) min = chislo[i];
	}System.out.println("max="+max);
	System.out.println("min="+min);
	

	}
}
