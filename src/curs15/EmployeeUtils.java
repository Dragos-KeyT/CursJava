package curs15;

public class EmployeeUtils<T extends Employee> {
	
	T employee;
	
	public EmployeeUtils(T employee) {
		this.employee = employee;
	}
	
	public int getSalary() {
		return employee.getSalary();
	}
	
	public boolean isSalaryEqual(EmployeeUtils<?> otherEMployee) {
		
		if(employee.getSalary() == otherEMployee.getSalary()) {
			
			return true;
		}
		
		return false;
	}
	
	
	

}
