import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Container {

	private List<Tovar_1>al=new ArrayList<Tovar_1>();
	public void Add(Tovar_1 newTovar)
	{
		al.add(newTovar);
	}
public int count(){
	return al.size();
}
public Tovar_1 get(int i){
	return al.get(i);
}
public void sort1(){
	Collections.sort(al);
	
}
public void print(){
	for(Tovar_1 o:al)
		System.out.println(o);
}

}
