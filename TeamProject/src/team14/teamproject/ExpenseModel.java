/* TODO: categories, currencies, constructor
 * 
 */

package team14.teamproject;

import java.util.GregorianCalendar;

public class ExpenseModel {
	private int amount;
	private String description;
	private GregorianCalendar date;
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public GregorianCalendar getDate() {
		return date;
	}
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	
	
}
