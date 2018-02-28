package com.bridgeit.model;

/**Purpose: This class contains the setters
 *  and getters methods,to set and get values 
 *  of Student
 * @author SANA SHAIKH
 *
 */
public class Student {
	
	private long id;
    private String name;
    private String degree;
    private String roll;
    private String phone;
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDegree() {
        return degree;
    }
 
    public void setDegree(String degree) {
        this.degree = degree;
    }
 
    public String getRoll() {
        return roll;
    }
 
    public void setRoll(String roll) {
        this.roll = roll;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
}
