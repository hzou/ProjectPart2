/* TODO:
 * - IMPORTANT: EXTENT OF CONTROL BASED ON STATUS (implement in Activity instead of controller?)
 * - Add/remove claim
 * - Detecting if any fields are null and giving warning
 * - Sorting claims based on startDate
 * - Sorting expenses based on date
 * - Calculating and displaying total currency amounts
 * - Expense methods (category, currency, amount, description)
 * - Attaching a photographed receipt with 65536 byte limit
 */

package team14.teamproject;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

/* Singleton controller that controls everything a claimant does:
 * (1) Manipulating claims
 * (2) Manipulating claims' tags
 * (3) Manipulating an expense inside a claim
 */
public class ClaimantController {
	private static ArrayList<ClaimModel> claims;
	private static String claimantName;
	private static DataHandler datahandler;
	private static int claim;
	private static int expense;
	
	public ClaimantController(String name){
		claimantName = name;
		datahandler = new DataHandler();
		// get filename based on user's name, sync with server (unless offline), load claims from file.
		claims = datahandler.loadFromFile(new ClaimModel());
	}
	
	
	/* Sets the single claim/expense that is focused, for editing.
	 * This value is based on position in the ListView, which is based on its startDate.
	 * If the startDate changes, this field will only change (the list resorted) in the ListView,
	 * and the ListView is not where the editing happens, so there shouldn't be any problem.
	 */
	public void setClaim(int claim){
		this.claim = claim;
	}
	
	public void setExpense(int expense){
		this.expense = expense;
	}
	
	// Claim:
	
	public void removeClaim(){
		claims.remove(claim);
	}
	
	public void addClaim(){
		
	}
	
	// For manipulating destination-reason hash
	public HashMap<String, String> getDestinations(){
		return claims.get(claim).getDestinations();
	}
	
	public void addDestination(String destination){
		HashMap<String, String> destinations = claims.get(claim).getDestinations();
		destinations.put(destination, null);
	}
	
	public void setReason(String destination, String reason){
		HashMap<String, String> destinations = claims.get(claim).getDestinations();
		destinations.put(destination, reason);
	}
	
	public void removeDestination(String destination){
		HashMap<String, String> destinations = claims.get(claim).getDestinations();
		destinations.remove(destination);
	}
	
	public void changeDestination(String destinationBefore, String destinationAfter){
		HashMap<String, String> destinations = claims.get(claim).getDestinations();
		String reason = destinations.remove(destinationBefore);
		destinations.put(destinationAfter, reason);
	}
	
	// For manipulating tags
	public ArrayList<String> getTags(){
		return claims.get(claim).getTags();
	}
	
	public void addTag(String tag){
		claims.get(claim).getTags().add(tag);
	}
	
	public void editTag(int tagBefore, String tagAfter){
		ArrayList<String> tags = claims.get(claim).getTags();
		tags.remove(tagBefore);
		tags.add(tagBefore, tagAfter);
	}
	
	public void removeTag(int tag){
		claims.get(claim).getTags().remove(tag);
	}
	
	// Controlling dates
	public void setStartDate(int year, int month, int day){
		claims.get(claim).setStartDate(new GregorianCalendar(year, month, day));
	}
	
	public void setEndDate(int year, int month, int day){
		claims.get(claim).setEndDate(new GregorianCalendar(year, month, day));
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
	
	
	public void setStatus(int status){
		claims.get(claim).setStatus(status);
	}
	
	public int getStatus(){
		return claims.get(claim).getStatus();
	}
	
	public String[] getStatuses(){
		return claims.get(claim).getStatuses();
	}
	
	
	// Expense:
	
	
	public void setDate(int year, int month, int day){
		claims.get(claim).getExpenses().get(expense).setDate
							(new GregorianCalendar(year, month, day));
	}
	
	public String getDate(){
		GregorianCalendar gc = claims.get(claim).getExpenses().get(expense).getDate();
		String date = DateFormat.getDateInstance(DateFormat.LONG).format(gc.getTime());
		return date;
	}
}
