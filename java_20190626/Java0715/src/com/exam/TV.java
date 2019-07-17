package com.exam;

public class TV {

	String brand;
	int year;
	int num;
		
    TV(String _brand, int _year, int _num){
    	brand = _brand;
    	year = _year;
    	num = _num;
    }
	
    
    void setBrand(String _brand) {
    	brand = _brand;
    }
	
    
    void setYear(int _year) {
    	year = _year;
    }
    
    void setNum(int _num) {
    	num = _num;
    }
    
    String getBrand(String _brand) {
    	brand = _brand;
    	return brand;
    }
    
    int getYear(int _year) {
    	year = _year;
    	return year;
    }
    
    int getNum(int _num) {
    	num = _num;
    	return num;
    }
    
    
    void show() {
    	System.out.println(brand + "에서 만든" + year + "년형" + num + "인치 TV");
    }
    
    
	
	}

