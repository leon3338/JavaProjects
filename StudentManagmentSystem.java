package defaultpackage;


public class StudentManagmentSystem {

	public static void main(String[] args) {
		

Address homeAddress = new Address("2700 W 44th st ", "apt 303, ", "Minneapolis ", " MN", " 55410");		

Address workAddress = new Address("1275 south kensington", "na", "Toronto", "Canada", "103533");

Address schoolAddress = new Address("1423 random street", "words", "Lisbon", "Portugal", "15161");

StudentHighSchoolInfo andrewHSInfo = new StudentHighSchoolInfo(4.0, schoolAddress);


Student andrew = new Student (" Andrew", "Robert", "Leonard", homeAddress, workAddress, "6512100876", andrewHSInfo );
		System.out.println(andrew.toString());
	
		System.out.println(andrewHSInfo.getHighSchoolInfo());
		System.out.println(homeAddress.toString());
		System.out.println(workAddress.toString());
		
		
		
		
	}
}

