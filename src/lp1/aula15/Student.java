package lp1.aula15;


public class Student {
	private String name;
	private static String college = "iCEV";
	
	public Student() {
	}

	public Student(String aName, String aCollege) {
		this.name = aName;
		this.college = aCollege;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	public static void change() {
		college += " novo"; 
	}
	
	public void imprimir() {
		System.out.println(getName() + ": " + getCollege());
	}
	
}
