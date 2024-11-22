package st;


public class student {
private	String studentName;
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}
	public  void display()
	{
		System.out.println("student is  "+studentName+"and the id is"+id);
	}
	
	

}
