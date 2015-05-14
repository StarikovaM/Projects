
public class Test_main {

	public static void main(String [] args){
		Tovar_2 t2=new Tovar_2();
		Tovar_3 t3=new Tovar_3();
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		
		Tovar_2 t4=new Tovar_2(60,"frame- wood",40,20);
		Tovar_3 t5=new Tovar_3(200,"picture","oil");
		System.out.println(t4.toString());
		System.out.println(t5.toString());
		Tovar_2.average_price();
		Tovar_3.average_price();
		System.out.println("");
		Container c=new Container();
		c.Add(t2);
		c.Add(t3);
		c.Add(t4);
		c.Add(t5);
		c.print();
		System.out.println("");
		c.sort1();
		c.print();
	}

}
