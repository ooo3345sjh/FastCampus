package ch24;

import java.util.*;

public class Student {
	private static int sirialNum = 1000;
	private String name;
	private int studentID;
	private ArrayList<Subject> list;
	
	public Student(String name) {
		this.name = name;
		this.studentID = ++sirialNum;
		list = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void addSubject(String title, int score) {
		Subject subject = new Subject(title, score);
		list.add(subject);
	}
	
	public int totalScore() {
		int total = 0;
		for(Subject s : list) {
			total += s.getScore();
		}
		return total;
	}
	
	public void showInfo() {
		System.out.print(name + "학생은 ");
		for(int i=0; i<list.size(); i++) {
			Subject s = list.get(i);
			if(i == list.size()-1) {
				System.out.println(s.getTitle() + " " + s.getScore() + "점이며 총점은 " + totalScore() + "점입니다.");
			} else {
			System.out.print(s.getTitle() + " " + s.getScore() + "점, ");
			}
		}
	}
}
