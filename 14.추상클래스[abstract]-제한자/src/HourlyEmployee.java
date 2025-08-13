public class HourlyEmployee extends Employee {
	private int worksHour;
	private int payPerHour;
	public HourlyEmployee() {
		
	}
public HourlyEmployee(int no, String name, int worksHour, int payPerHour) {
	

	
	super();
	this.worksHour = worksHour;
	this.payPerHour = payPerHour;
}
	@Override
	public void culculatePay() {
		this.setPay(this.worksHour*this.payPerHour);
		
	}
	public void print() {
		super.print();
		System.out.println(worksHour+"\t" + payPerHour);
	}

}
