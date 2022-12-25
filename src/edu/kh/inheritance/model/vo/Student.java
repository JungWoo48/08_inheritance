package edu.kh.inheritance.model.vo;

public class Student extends Person{
	// extends로 Student 클래스에 Person 클래스 내용을 확장시킨다
	// ==Student
	
	
	
	
	//private String name;
	//private int age;
	//private String nationality;
	private int grade;
	private int classRoom;
	
	public Student() {//기본생성자
		// Student() 객체 생성자
		// 내부에 상속받은 person 객체를 생성하기 위한
		// person 생성자 호출 코드가 필요하다
		//이때 SUPER를 이용
		super();
		//super 생성자는 부모의 생성자를 호출한다
		//반드시 자식 생성자 최상단에 적는다
		
		//만약 미작성시 컴파일러가 자동으로 부른다
		
	}

	public Student(String name, int age, String nationality, int grade, int classRoom) {
		//super();
		//this.name = name;
		//this.age = age;
		//this.nationality = nationality;
		super(name, age, nationality);
		this.grade = grade;
		this.classRoom = classRoom;
		
		//super() 생성자
		//1.자식 내 부모객체 생성
		//2. 부모객체 생성시 초기화
		
	}
	/*}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}*/

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + grade + " / " + classRoom;
	}
	
	
}
