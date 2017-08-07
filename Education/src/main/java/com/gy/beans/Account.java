package com.gy.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class Account implements Serializable {
	/**
	 * 
	 */
	

	private static final long serialVersionUID = 1L;
	private UserInfo stu_user;
	private BigDecimal balance;
	
	
	public UserInfo getStu_user() {
		return stu_user;
	}
	public void setStu_user(UserInfo stu_user) {
		this.stu_user = stu_user;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [stu_user=" + stu_user + ", balance=" + balance + "]";
	}
	
	                                  
}
