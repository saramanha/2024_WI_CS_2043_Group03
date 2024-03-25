package project.xyz;

import java.util.*;
import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private static int userId = 10;
	private final int USER_ID;
	private String userName;
	private String password;
	private String email;
	private ArrayList<Ticket> inventory;
	
	public User(String userName, String password, String email) {
		USER_ID = userId++;
		this.userName = userName;
		this.password = password;
		this.email = email;
		inventory = new ArrayList<>();
	}
	
	public int getUserId() {
		return USER_ID;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void addTicket(Ticket toAdded) {
		int index = 0;
		for (int i=0; i<inventory.size(); i++) {
			if (toAdded.getSeat().getDate().compareTo(inventory.get(i).getSeat().getDate())<0) {
				index = i;
				break;
			}
			else if (toAdded.getSeat().getDate().compareTo(inventory.get(i).getSeat().getDate())==0) {
				if (toAdded.getSeat().getTime().compareTo(inventory.get(i).getSeat().getTime())<=0) {
					index = i;
					break;
				}
			}
		}
		if (index != 0) {
			inventory.add(index, toAdded);
		}
		else {
			inventory.add(toAdded);
		}
	}
	
	public void delTicket(Ticket deleted) {
		inventory.remove(deleted);
	}
	
	public ArrayList<Ticket> getTickets() {
		return inventory;
	}
	
	public boolean checkPassword(String password) {
		boolean result = false;
		if (this.password.equals(password)) {
			result = true;
		}
		return result;
	}
	
	public String getInventoryString() {
		String output = null;
		for (int i=0; i<inventory.size(); i++) {
			output += inventory.get(i).toString()+"\n";
		}
		return output;
	}
	
	public String toString() {
		return "ID: "+USER_ID+"\tUser Name: "+userName+"\tEmail: "+email;
	}
}
