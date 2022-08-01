package defaultpackage;




public class StudentHighSchoolInfo {
	
private Address schoolAddress;
private double GPA;
public StudentHighSchoolInfo(Address schoolAddress, double GPA)
{
this.schoolAddress = schoolAddress;
this.GPA = GPA;
}
	
	
public Address getSchoolAddress() 
{
return schoolAddress;
}

public void setSchoolAddress(Address schoolAddress) 
{
this.schoolAddress = schoolAddress;
}
public double getStudentGPA() 
{
return GPA;
}
public void setStudentGPA ( double GPA) 
{
this.GPA = GPA;	
}


}
