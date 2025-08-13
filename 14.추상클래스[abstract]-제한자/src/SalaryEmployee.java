public class SalaryEmployee extends Employee {
	
	private int annualSalary; //연봉
	
	public SalaryEmployee() {
		
	}
	public SalaryEmployee(int no, String name, int annualSalary) {
		super(no,name);
		this.annualSalary = annualSalary;
	}

	@Override
	public void culculatePay() {
		int calcPay = this.annualSalary/12;
		
		/*
		 
		 << The field Employee.pay is not visible >>
		
		   - this.pay = calcPay;
		
		*/
		
		
		this.setPay(calcPay);
		
	}
	@Override
	public void print() {
		super.print();
		System.out.println(annualSalary);
	}

}
