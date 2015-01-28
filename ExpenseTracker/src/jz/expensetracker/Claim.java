package jz.expensetracker;

import java.util.ArrayList;
import java.util.Date;

public class Claim {
	private Date date;
	private ArrayList<Expense> expenses;
	

	public Claim(Date date, ArrayList<Expense> expenses) {
		super();
		this.date = date;
		this.expenses = expenses;
	}
	
	public ArrayList<Expense> getExpenses() {
		return expenses;
	}
	public void setExpenses(ArrayList<Expense> expenses) {
		this.expenses = expenses;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
