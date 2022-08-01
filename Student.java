package defaultpackage;



public class Student 
{
private String firstName, middleName, lastName;
private Address workAddress, homeAddress;
private String studentPhone;

public Student() 
{
	
}
public Student(String firstName, String middleName, String lastName, Address workAddress, Address homeAddress,
		String studentPhone, StudentHighSchoolInfo studentHSInfo) {
	
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.workAddress = workAddress;
	this.homeAddress = homeAddress;
	this.studentPhone = studentPhone;
	this.studentHSInfo = studentHSInfo;
}

StudentHighSchoolInfo studentHSInfo = new StudentHighSchoolInfo(), 0);
public String getFirstName() {
	return firstName;
}
public String getMiddleName() {
	return middleName;
}
public String getLastName() {
	return lastName;
}
public String getfullName() {
	String fullName =  firstName + " " + middleName +" "+ lastName;
	return fullName;
}
public String getPhoneNumber() {
	return studentPhone;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}


public void setStudentPhone(String studentPhone) {
			this.studentPhone = studentPhone;
}
public Address getStudentAddressHome() {
	return homeAddress;
}
public Address getStudentAddressWork() {

	return workAddress;
}


	
public String toString() {	
		
return "My name is " + firstName + " " + middleName + " " + lastName + ", my work address is " + workAddress.toString() +
" and my home address is " + homeAddress.toString() + ".\n You can contact me on my phone at " + studentPhone +
". I went to an awesome high school at " + studentHSInfo.getSchoolAddress() + " and guess what my GPA was " + studentHSInfo.getStudentGPA();
}
}
