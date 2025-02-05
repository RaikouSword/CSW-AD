//Q6

package ass1;
class College{
	String collegeName;
	String collegeLoc;
}
class Student{
	int StudentId;
	String StudentName;
	College c = new College();
	public Student(String StudentName, int StudentId, String cname,String clocation) {
		this.StudentName = StudentName;
		this.StudentId = StudentId;
		c.collegeName = cname;
		c.collegeLoc = clocation;
	}
	void displayStudentInfo() {
		System.out.println("Student Name: "+StudentName);
		System.out.println("Student Id: "+StudentId);
		System.out.println("College name: "+c.collegeName);
		System.out.println("College location: "+c.collegeLoc);
	}
}
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		College c1 = new College();
//		College c2 = new College();
		Student s1 = new Student("Rajendra", 54,"SOA","BBSR");
		Student s2 = new Student("Sourav", 39,"Gulu University","Uganda");
		s1.displayStudentInfo();
		System.out.println();
		s2.displayStudentInfo();
	}

}
