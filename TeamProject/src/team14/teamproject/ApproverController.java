package team14.teamproject;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class ApproverController {
	private static ArrayList<ClaimModel> claims;
	private static String approverName;
	private static DataHandler datahandler;
	private static int claim;
	private static int expense;
	
	public ApproverController(String approverName){
		this.approverName = approverName;
		datahandler = new DataHandler();
		// get filename based on user's name, sync with server (unless offline), load claims from file.
		claims = datahandler.loadFromFile(new ClaimModel());
	}
	
	public HashMap<String, String> getDestinations(){
		return claims.get(claim).getDestinations();
	}
	
	public String getStartDate(){
		GregorianCalendar gc = claims.get(claim).getStartDate();
		String startDate = DateFormat.getDateInstance(DateFormat.LONG).format(gc.getTime());
		return startDate;
	}
	
	public String getEndDate(){
		GregorianCalendar gc = claims.get(claim).getEndDate();
		String date = DateFormat.getDateInstance(DateFormat.LONG).format(gc.getTime());
		return date;
	}
	
	public String getApproverComment(){
		return claims.get(claim).getApproverComment();
	}
	
	public void setApproverComment(String approverComment){
		claims.get(claim).setApproverComment(approverComment);
	}
	
	public String[] getStatuses(){
		return claims.get(claim).getStatuses();
	}
	
	public int getStatus(){
		return claims.get(claim).getStatus();
	}
	
	public void setStatus(int status){
		claims.get(claim).setStatus(status);
	}
}