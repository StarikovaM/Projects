import java.util.Scanner;
public class Task1_6_3 {
	public static void main(String[]args) {
	System.out.println("Сколько целых чисел вы собираетесь ввести? ");
    Scanner scan = new Scanner(System.in);
    int colvo_chisel = scan.nextInt();
    if (colvo_chisel  == 0) {
        System.out.print("Программа завершена.");
        System.exit(0);}
        Integer[] chislo = new Integer[colvo_chisel];
System.out.println("введите числа и нажмите <Enter>:");		
for(int i=0; i<colvo_chisel ;i++)
{ chislo[i]=scan.nextInt();
	if((chislo[i] % 3)==0|(chislo[i] % 9)==0)
		System.out.println("делится на 3 или на 9");
	
	else 
		System.out.println(" не делятся");
}
scan.close();

}}
