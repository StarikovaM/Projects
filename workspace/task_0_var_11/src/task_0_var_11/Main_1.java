package task_0_var_11;

public class Main_1 {

	
		public static void main(String[] args) {
			Bus b []= new Bus[4];
			b[0]= new Bus("Stavrulov V.P","AX3456BB",1,"Bogdan",2014,10000);
			b[1]= new Bus("Petrov L.I.","AX5656AC",2,"Mercedes",2012,30000);
			b[2]= new Bus("Belous E.A.","AX1122CB",1,"Bogdan",2013,20200);
			b[3]= new Bus("Dogma A.A.","AX9098BB",5,"Ford",2010,50000);
			for (int i = 0; i <= 3; i++) {
	            b[i].show();
			}
			System.out.println();
	        for (int i = 0; i <= 3; i++) {
	        	b[i].nomber_of_bus();
	        }
	        System.out.println();
	        for (int i = 0; i <= 3; i++) {
	        	b[i].srok();
	        }
	       System.out.println();
	        for (int i = 0; i <= 3; i++) {
	        	b[i].run();
	        }
	            
		}
		

	}

