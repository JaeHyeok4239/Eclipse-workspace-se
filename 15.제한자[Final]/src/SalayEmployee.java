


public class SalayEmployee extends Employee {
	private int annualSalary;//연봉
	public SalayEmployee() {
	}
	public SalayEmployee(int no,String name,int annualSalary) {
		super(no,name);
		this.annualSalary = annualSalary;
	}
	@Override
	public void calculatePay() {
		int calcPay=this.annualSalary/12;
		/*
		<<The field Employee.pay is not visible>>
		this.pay=calcPay;
		*/
		this.setPay(calcPay);
	}
	@Override
	public void print() {
		super.print();
		System.out.println(annualSalary);
	}
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
}
