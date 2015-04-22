import java.util.Scanner;


public class Task2_9_5 {
	public static void main(String[]args) {
	System.out.println("Сколько целых чисел вы собираетесь ввести? ");
    Scanner scan = new Scanner(System.in);
    int colvo_chisel = scan.nextInt();
    if (colvo_chisel  == 0) {
        System.out.print("Программа завершена.");
        System.exit(0);}
    int[][] Arr = new int[colvo_chisel][colvo_chisel];

 // fill matrix
     for (int i=0; i<colvo_chisel; i++)
     {
      for (int j=0; j<colvo_chisel; j++)
       {
       Arr[i][j] = colvo_chisel*i + j;
       }
     }

 // print
     for(int i=0;i<colvo_chisel;i++,System.out.println()){
    	 for(int j=0;j<colvo_chisel;j++)
    		 System.out.print(Arr[i][j]+" ");
     }
     System.out.println();

 // rotate
     for (int k=0; k<colvo_chisel/2; k++) // border -> center
     {
    	 for (int j=k; j<colvo_chisel-1-k; j++) // left -> right
    	 {
 // меняем местами 4 угла
    		 int tmp = Arr[k][j];
    		 Arr[k][j]= Arr[j][colvo_chisel-1-k];
    		 Arr[j][colvo_chisel-1-k]= Arr[colvo_chisel-1-k][colvo_chisel-1-j];
    		 Arr[colvo_chisel-1-k][colvo_chisel-1-j] = Arr[colvo_chisel-1-j][k];
    		 Arr[colvo_chisel-1-j][k] = tmp;
    	 }
     }

 // print
     System.out.println("поворот на 90 градусов");
     for(int i=0;i<colvo_chisel;i++,System.out.println()){
    	 for(int j=0;j<colvo_chisel;j++)
    		 System.out.print(Arr[i][j]+" ");
     }

	}
}