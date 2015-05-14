
public class Tovar_2 extends Tovar_1{
int hight;
int width;
static int count=0;
static double commonPrice=0;
public int getHight() {
	return hight;
}
public void setHight(int hight) {
	this.hight = hight;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public double getCommonPrice() {
	return commonPrice;
}
public void setCommonPrice(double commonPrice) {
	this.commonPrice = commonPrice;

}
public Tovar_2(){
	this.setPrice(50);
	this.setName("photo frame");
	this.setHight(25);
	this.setWidth(15);
	count++;
	commonPrice+=50;
}
public Tovar_2(double price, String name, int hight, int width){
	this.setPrice(price);
	this.setName(name);
	this.setHight(hight);
	this.setWidth(width);
	count++;
	commonPrice+=price;
}
@Override
public String toString() {
	return "this is the photo frame where hight=" + hight + ", width=" + width + ", count=" + count
			+ ", commonPrice=" + commonPrice + "]";
}
	static public void average_price(){
		System.out.println(commonPrice/count);
	}

}
