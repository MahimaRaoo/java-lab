import stud_details.student;
//import stud_details.student.*;
import faculty_details.faculty;
//import faculty_details.faculty.*;

public class q2a {

	public static void main(String[] args) {
		
student s1=new student();
s1.student_getval(1234,"mahima", 99, 99, 100, 9.5);
s1.student_disp();
faculty f1=new faculty();
f1.faculty_getval(23, "xyz", "proffessor", 5);
f1.faculty_disp();

	}

}
