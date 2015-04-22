import java.util.Scanner;


public class Task2_6 {
	public static void main(String[]args) {		
	    Scanner scan = new Scanner(System.in);	   
	    String tmp="";
	    
	    String [] mas1=new String[4];
	    for(int i=0; i<mas1.length; i++)	{    		    	
	    		mas1[i]=scan.nextLine();
	    		System.out.println();	}    	
	    	
	for(int i=0; i<mas1.length;i++){
		for(int j=1; j<mas1[i].length();j++){
			if(mas1[i].charAt(j)>mas1[i].charAt(j-1))
				{tmp=mas1[i];
		}
		else{
			break;	}
	}}
		System.out.println(tmp);
		}}