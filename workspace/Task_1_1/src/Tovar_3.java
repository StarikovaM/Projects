
public class Tovar_3 extends Tovar_1{
	
	String describe;
static int count=0;
static double commonPrice=0;

public String getDescribe() {
	return describe;
}

public void setDescribe(String describe) {
	this.describe = describe;
}

public static int getCount() {
	return count;
}

public static void setCount(int count) {
	Tovar_3.count = count;
}

public static double getCommonPrice() {
	return commonPrice;
}

public static void setCommonPrice(double commonPrice) {
	Tovar_3.commonPrice = commonPrice;
}

public Tovar_3(){
	this.setPrice(250);
	this.setName("picture");
	this.setDescribe("akvarel");
	count++;
	commonPrice+=250;
	
}
public Tovar_3(int price, String name, String describe){
	this.setPrice(price);
	this.setName(name);
	this.setDescribe(describe);
	count++;
	commonPrice+=price;
	
}

@Override
public String toString() {
	return "this is "+getName()+" describe= " + describe + "wiht cost: "+getPrice();
}
static public void average_price(){
	System.out.println(commonPrice/count);
}
}
