class Student{
	int id= 46;
	String name="Pragyan";
	int Age=17;
	void DisplayDetails(){
		String Status = "Active";
		System.out.println("Student id: " +id);
		System.out.println("Student name: " +name);
		System.out.println("Age " +Age);
		System.out.println("Status:  " +Status);
	}
	public static void main (String args[]){
		Student s1=new Student();
		s1.DisplayDetails();
	}
	
}