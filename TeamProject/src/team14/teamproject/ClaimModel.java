package team14.teamproject;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Set;

public class ClaimModel {
	
	// Map of destination (key) to reason (value). reason can be null. 
	private HashMap<String, String> destinations;
	
	// User's name
	private String claimantName;
	
	private String approverName;
	
	// Approver's comment
	private String approverComment;
	
	// Start and end dates GregorianCalendar(int year, int month, int day)
	private GregorianCalendar startDate;
	private GregorianCalendar endDate;
	
	// Expenses held inside Claim
	private ArrayList<ExpenseModel> expenses;
	
	private int status;
	private static final String[] STATUSES = {"In progress","Submitted", "Approved", "Returned"};
	
	private ArrayList<String> tags;

	public ClaimModel() {
		destinations = new HashMap<String, String>();
		claimantName = "";
		startDate = new GregorianCalendar();
		endDate = new GregorianCalendar();
		expenses = new ArrayList<ExpenseModel>();
		status = 0;
		tags = new ArrayList<String>();
	}

	public HashMap<String, String> getDestinations() {
		return destinations;
	}

	public void setDestinations(HashMap<String, String> destinations) {
		this.destinations = destinations;
	}

	public String getClaimantName() {
		return claimantName;
	}

	public void setClaimantName(String name) {
		claimantName = name;
	}

	
	public String getApproverName() {
		return approverName;
	}

	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}

	public void setApproverComment(String approverComment) {
		this.approverComment = approverComment;
	}
	
	public String getApproverComment() {
		return approverComment;
	}

	public GregorianCalendar getStartDate() {
		return startDate;
	}

	public void setStartDate(GregorianCalendar startDate) {
		this.startDate = startDate;
	}

	public GregorianCalendar getEndDate() {
		return endDate;
	}

	public void setEndDate(GregorianCalendar endDate) {
		this.endDate = endDate;
	}

	public ArrayList<ExpenseModel> getExpenses() {
		return expenses;
	}

	public void setExpenses(ArrayList<ExpenseModel> expenses) {
		this.expenses = expenses;
	}

	public int getStatus() {
		return status;
	}

	public String[] getStatuses(){
		return STATUSES;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	
}
