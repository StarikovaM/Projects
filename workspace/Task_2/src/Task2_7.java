import java.util.HashSet;
import java.util.Scanner;


public class Task2_7 {public static void main(String[]args) {
	System.out.println("������� ����� ����� �� ����������� ������? ");
	Scanner scan = new Scanner(System.in);
    int colvo_chisel = scan.nextInt();
    if (colvo_chisel  == 0) {
        System.out.print("��������� ���������.");
        System.exit(0);}
	int  diff_numbers=100, difnumsmin=100,min=0; 
    System.out.println("������� ����� � ������� <Enter>:");
    int nums []=new int[colvo_chisel];
    for(int i=0;i<colvo_chisel;i++){
    	nums[i]=scan.nextInt();}
    for(int i=0;i<colvo_chisel;i++){
    	String strNumberIncom=Integer.toString(nums[i]);
    	HashSet <Character>hSet=new HashSet<>();//��������� � ������� �� ����� ���� ���������� ���������
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
