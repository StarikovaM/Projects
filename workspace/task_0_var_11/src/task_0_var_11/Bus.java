package task_0_var_11;

public class Bus {
	String name_of_driver;
	String number_of_bus;
	int number_of_route;
	String marks;
	int start_of_operation;
	double run;
	public Bus(String name_of_driver, String number_of_bus,
			int number_of_route, String marks, int start_of_operation,
			double run) {
		super();
		this.name_of_driver = name_of_driver;
		this.number_of_bus = number_of_bus;
		this.number_of_route = number_of_route;
		this.marks = marks;
		this.start_of_operation = start_of_operation;
		this.run = run;
	}
	public String getName_of_driver() {
		return name_of_driver;
	}
	public void setName_of_driver(String name_of_driver) {
		this.name_of_driver = name_of_driver;
	}
	public String getNumber_of_bus() {
		return number_of_bus;
	}
	public void setNumber_of_bus(String number_of_bus) {
		this.number_of_bus = number_of_bus;
	}
	public int getNumber_of_route() {
		return number_of_route;
	}
	public void setNumber_of_route(int number_of_route) {
		this.number_of_route = number_of_route;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public int getStart_of_operation() {
		return start_of_operation;
	}
	public void setStart_of_operation(int start_of_operation) {
		this.start_of_operation = start_of_operation;
	}
	public double getRun() {
		return run;
	}
	public void setRun(double run) {
		this.run = run;
	}
	@Override
	public String toString() {
		return "Bus [name_of_driver=" + name_of_driver + ", number_of_bus="
				+ number_of_bus + ", number_of_route=" + number_of_route
				+ ", marks=" + marks + ", start_of_operation="
				+ start_of_operation + ", run=" + run + "]";
	}
public void show(){
	System.out.println("name of driver: "+ getName_of_driver());
	System.out.println("number of bus: "+ getNumber_of_bus());
	System.out.println("number of route: "+ getNumber_of_route());
	System.out.println("marks: "+ getMarks());
	System.out.println("start of operation: "+ getStart_of_operation());
	System.out.println("run: "+getRun());
}
public void nomber_of_bus(){
	if((this.getNumber_of_route())==1){
		System.out.println("name of driver: "+ getName_of_driver());
		System.out.println("number of bus: "+ getNumber_of_bus());
		System.out.println("number of route: "+ getNumber_of_route());
		System.out.println("marks: "+ getMarks());
		System.out.println("start of operation: "+ getStart_of_operation());
		System.out.println("run: "+getRun());
	}
}
public void srok(){
	if((this.getStart_of_operation())>2013){
		System.out.println("name of driver: "+ getName_of_driver());
		System.out.println("number of bus: "+ getNumber_of_bus());
		System.out.println("number of route: "+ getNumber_of_route());
		System.out.println("marks: "+ getMarks());
		System.out.println("start of operation: "+ getStart_of_operation());
		System.out.println("run: "+getRun());
	}
}
public void run(){
	if((this.getRun())>20000){
		System.out.println("name of driver: "+ getName_of_driver());
		System.out.println("number of bus: "+ getNumber_of_bus());
		System.out.println("number of route: "+ getNumber_of_route());
		System.out.println("marks: "+ getMarks());
		System.out.println("start of operation: "+ getStart_of_operation());
		System.out.println("run: "+getRun());
	}
}
}
