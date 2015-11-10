/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author TOcvfan
 */
public class User {
    private String name;
    private int money = 5000;
    private int drugs;
    private int daysleft = 20;

    public User() {
    }

    public User(String name, int money) {
	this.name = name;
	this.money = money;
	
    }

    @Override
    public String toString() {
	return name;
    }

   

    public User(String name, int money, int drugs, int daysleft) {
	this.name = name;
	this.money = money;
	this.drugs = drugs;
	this.daysleft = daysleft;
	
    }

   
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getMoney() {
	return money;
    }

    public void setMoney(int money) {
	this.money = money;
    }

    
    public int getDrugs() {
	return drugs;
    }

    public void setDrugs(int cocaine) {
	this.drugs = drugs;
    }

    public int getDaysleft() {
	//System.out.println(daysleft);
	return daysleft;
    }

    public void setDaysleft(int daysleft) {
	this.daysleft = daysleft;
    }

    
    
}
