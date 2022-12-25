package edu.kh.inheritance.model.vo;

public class Person {
	//필드
	//사람이라면 가지고 있는것
	private String name;
	private int age;
	private String nationality;
	
	//생성자
	public Person() {} //기본 생성자
	
	//매개변수 생성자
	public Person(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

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
	}
	
	public void breath() {
		
		System.out.println("사람은 코나 입으로 숨쉰다");
		
	}
	
	public void move() {
		
		System.out.println("사람은 움직일수 있다");
		
	}
	
	// toString() 메서드는 객체가 가지고 있는 모든값9필드)를
	// 하나의 문자열로 반환하는 용도의 메소드
	@Override
	public String toString() {
		return name + " / " + age + " / " + nationality;
		//김철수 / 17/ 한국
		
	}
	
	
	
}
