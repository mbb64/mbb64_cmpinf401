package mbb64_Lab9;

public class Staff extends Person {
	public String school;
	public double pay;

	public Staff(String name, String address, double pay) {
		super.setName(name);
		super.setAddress(address);
		this.pay = pay;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return this.pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String toString() {
		return ("Staff info: " + name + ", " + address + ", " + school + ", " + pay + ".");
	}
}
