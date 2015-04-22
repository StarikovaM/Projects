import java.util.Scanner;
import java.util.Arrays;


public class Task2_9_2 {
	public static void main(String[]args) {
		System.out.println("Сколько целых чисел вы собираетесь ввести? ");
	    Scanner scan = new Scanner(System.in);
	    int colvo_chisel = scan.nextInt();
	    if (colvo_chisel  == 0) {
	        System.out.print("Программа завершена.");
	        System.exit(0);}
	    Integer [][] mas=new Integer[colvo_chisel][colvo_chisel];
	    System.out.println("->k ");
	    int k;
	    k=scan.nextInt();
	    for(int i=0; i<mas.length; i++,System.out.println())
	    	for(int j=0; j<mas[i].length;j++)
	    	{
	    		mas[i][j]=(int)(Math.random()*colvo_chisel);
	    		System.out.print(mas[i][j]+" ");
	    	
	    	}   
        if (k > 0)
            for (int i = 0; i < k; i++) {
               for(int j=0;j<mas.length;j++){          
    
        int tmp = mas[mas.length - 1][mas.length - 1];
        tmp=mas[j][mas.length-1];
              
            System.arraycopy(mas[j], 0, mas[j], 1, mas[j].length - 1);
            mas[j][0] = tmp;
        } 

            }
         System.out.println("сдвиг вправо на k единиц ");
        System.out.println(Arrays.deepToString(mas));
        if (k > 0)
            for (int i = 0; i < k; i++) {
            	int tmp=mas[0][0];
            	for(int j=0;j<mas.length;j++)
            	{
            		int n=0;
            		if(j+1<mas.length)
            			n=mas[j+1][0];
            		System.arraycopy(mas[j],1,mas[j],0,mas[j].length-1);
            		mas[j][mas[j].length-1]=n;
            	}
            	mas[mas.length-1][mas.length-1]=tmp;
            	
            }
        System.out.println("сдвиг влево на k единиц ");
        System.out.println(Arrays.deepToString(mas));
}}

