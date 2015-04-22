import java.util.Scanner;


public class Task2_2 {
	public static void main(String[]args) {
		int [] mas={456, 6789, 23,12346};
		for(int l=mas.length-1; l>=0; l--){
			for(int i=0;i<l;i++){
				if(mas[i]>mas[i+1]){
					int tmp=mas[i];
					mas[i]=mas[i+1];
					mas[i+1]=tmp;
				}
			}
		}for(int j=0; j<mas.length;j++)
		System.out.println(mas[j]);
	}
	
}
