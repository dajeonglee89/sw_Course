package com.exam;

public class Grade {
 
	
	 int math;
	 int science;
	 int english;
	 
	 
	 Grade(int _math, int _science, int _english){
		 math = _math;
		 science = _science;
		 english = _english;
	 }


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getScience() {
		return science;
	}


	public void setScience(int science) {
		this.science = science;
	}


	public int getEnglish() {
		return english;
	}


	public void setEnglish(int english) {
		this.english = english;
	}
	
	 
	double average(){
		return (math + science + english)/3.0;  
	}
	
	
	
	
	
	
}
