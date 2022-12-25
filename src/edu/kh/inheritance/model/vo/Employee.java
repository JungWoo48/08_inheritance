package edu.kh.inheritance.model.vo;

public class Employee extends Person {
						//person한테 상속 받음
	
	
	private String company;
	
	public Employee() {}
	//기본 생성자

	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
		//매개변수 생성자
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	//person 으로 부터 상속받는 메서드중
	//move() 메서드를 employee에 맞게 재정의 (==오버라이딩)
	
	//@Override 어노테이션 : 해당 메서드가 오버라이딩 되었음을 컴파일러에게 알려주는 역할
	
	//아노테이션 : 컴파일러에게 알려주기 위한 코드

	
	
	@Override //오버라이딩 시 작성
	public void move() {
		//기존 부모 코드를 삭제후 자식이 새롭게 재정의
		System.out.println("효율적인 직장");
	}
	
	//****오버라이딩 성립 조건 ****
	//1. 메소드 이름이 동일해야 한다
	//2. 메소드의 자료형, 개수, 순서가 일치해야한다.
	//3. 리턴타입이 동일
	//4. 접근제한자는 부모클래스의 메소드와 동일하거나 더 넓어야한다
	//5. 에외 처리는 같거나 좁게
	
	//+ 부모의 private 메서드는 오버라이딩 불가
	
	@Override
	public String toString() {
		return super.toString() + " / " + company;
		
	}
	
	
}
