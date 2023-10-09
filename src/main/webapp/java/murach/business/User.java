package murach.business;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
public class User implements Serializable {
	private String firstName;
	private String lastName;
	private String email;
	private String dateOfBirth;
	private String how;
	private String yes;
	private String contact;
	private ArrayList<String> yesList;
public User() { 
	firstName = "";
	lastName = "";
	email = "";
	dateOfBirth = "";
	
	yes = "";
	contact = "";
}

public ArrayList<String> getYesList() {
	return yesList;
}



public void setYesList(ArrayList<String> yesList) {
	this.yesList = yesList;
}

Scanner scanner = new Scanner(System.in);

public String getFirstName() {
	return firstName;
}



public void setFirstName(String firstName) {
	this.firstName = firstName;
}



public String getLastName() {
	return lastName;
}



public void setLastName(String lastName) {
	this.lastName = lastName;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getDateOfBirth() {
	return dateOfBirth;
}



public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}



public String getHow() {
	return how;
}



public void setHow(String how) {
	this.how = how;
}



public String getYes() {
	return yes;
}



public void setYes(String yes) {
	this.yes = yes;
}



public String getContact() {
	return contact;
}



public void setContact(String contact) {
	this.contact = contact;
}



public User (String firstName, String lastName, String email, String dateOfBirth) {
this.firstName = firstName;
this.lastName = lastName;
this.email = email;
this.dateOfBirth = dateOfBirth;
}


public User(String firstName, String lastName, String email, String dateOfBirth, String how, ArrayList<String> yesList,
		String contact) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.dateOfBirth = dateOfBirth;
	this.how = how;
	this.yesList = yesList;
	this.contact = contact;
}
}