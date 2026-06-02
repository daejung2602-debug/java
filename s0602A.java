package kkw0001;
import java.util.Scanner;

class Student{
	String name;
	int age;
	int score;
	String grade;
	
	Student(String name){
		this.name = name;
	}
	Student(String name,int age){
		this.name = name;
		this.age = age;
		this.score = 100;
	}
	void info() {
		System.out.println("이름: "+this.name);
		System.out.println("점수: "+this.score);
	}
	String setGrade(int score) {
		this.score = score;
		
		if(score >= 90) {
			this.grade ="A";
		}else if(score >=70) {
			this.grade ="B";
		}else if(score >=50) {
			this.grade ="C";
		}else {
			this.grade ="F";
		}
		return grade;
	}
}


public class s0602A {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: ");
		String name = sc.next();
		sc.close();
		
		String grade;
		Student s1 = new Student(name);
		s1.info();
		System.out.println("등급: "+s1.setGrade(78));
		grade = s1.setGrade(78);
		System.out.println("등급: "+grade);
		System.out.println("등급: "+s1.grade);
		

		Student s2 = new Student(name, 18);
		s2.info();
		s2.setGrade(87);
		
		Student[] st = new Student[3];
		st[0] = new Student("철수",12);
		st[1] = new Student("영희",13);
		st[2] = new Student("스마트",18);
		st[0].info();
		
		
	}

}
