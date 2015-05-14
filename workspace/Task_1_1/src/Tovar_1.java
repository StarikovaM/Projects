
public abstract  class  Tovar_1 implements Comparable<Tovar_1>{
 String name;
 double price;
@Override
public String toString() {
	return "Tovar_1 [name=" + name + ", price=" + price + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int compareTo(Tovar_1 o) {
    if (this.price < o.getPrice())
        return -1;
    else if (this.price == o.getPrice())
        return 0;
    else
        return 1;
}
/*public Tovar_1(String name, double price) {
	super();
	this.name = name;
	this.price = price;
}*/

}
