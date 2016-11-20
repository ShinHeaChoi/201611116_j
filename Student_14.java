import java.util.ArrayList;
import java.util.Collections;

class Student_14{
	private String name;
	private int StudentNum;
	public void Student(String name, int sNum) {
		this.name=name;
		this.StudentNum=sNum;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] argv){
		ArrayList<String> StudentNameList=new ArrayList<String>();
		Student_14 s = new Student_14();
		s.Student("CSH",201611116);
		StudentNameList.add(s.getName());
		s.Student("JBO",201612345);
		StudentNameList.add(s.getName());
		Collections.sort(StudentNameList);

		System.out.println(StudentNameList);
	}
}