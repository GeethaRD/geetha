package org.bank;

public class BankInfo extends AxisBank {

	private void saving() {
//edited
		System.out.println("saving");

	}

	private void fixed() {
//		edited
		System.out.println("Fixed");
	}

	public static void main(String[] args) {

		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
	}

}
