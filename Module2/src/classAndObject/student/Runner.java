package classAndObject.student;

public class Runner {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Sourabh";
		s1.optional = 71;
		s1.phy = 50;
		s1.chem = 39;
		s1.maths = 65;
		s1.disp();
		s1.percentage();	
		s1.totalMarks();
	}
}
