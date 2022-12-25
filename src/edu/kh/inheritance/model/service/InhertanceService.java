package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InhertanceService {
	
	public void ex1() {
		//상속 확인
		// person을 상속 받은 student가 필드, 메소드를 사용할수 있는가
		
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(27);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		System.out.println("===============");
		
		//student 객체 생성
		Student std = new Student();
		
		
		//student 고유 메소드
		std.setGrade(3);
		std.setClassRoom(5);
		
		//person에 상속받은 메소드
		std.setAge(30);
		std.setName("고길동");
		std.setNationality("대한민국");
		
		//고유 메소드 출력
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		//student가 person의 메소드 뿐만 아니라 필드도 상속받았는지 확인
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		
		System.out.println("=================");
		
		p.breath();
		std.breath();
		p.move();
		std.move();
		
		Employee emp = new Employee();
		emp.move();
		
	}
	
	public void ex2() {
		// super () 생성자 사용법
		Student std = new Student("김철수", 17, "한국", 1, 3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		
		
		
	}
	
	public void ex3() {
		Person p = new Person("kim", 30, "한국");
		
		System.out.println(p.toString());
		System.out.println(p);//print구문 수행시 참조변수명을 작성하면 자동으로 toStrong 호출
		
		
		//super 참조변수 테스트
		
		Student std = new Student("Lee", 25, "미국", 2, 6);
		System.out.println(std.toString());
		
		Employee emp = new Employee("park", 26, "한국", "증권" );
		System.out.println(emp.toString());
		
	}
	
	
	
	

}
