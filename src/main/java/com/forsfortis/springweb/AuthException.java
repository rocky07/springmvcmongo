package com.forsfortis.springweb;

import java.util.Date;

public class AuthException extends RuntimeException {

	private Date dt;
	private String message;
	
	
	
	
	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	AuthException(Date dt,String msg) {
		super();
		this.dt=dt;
		this.message=msg;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "date : "+this.getDt().toString()+"message "+this.getMessage();
		}
}
