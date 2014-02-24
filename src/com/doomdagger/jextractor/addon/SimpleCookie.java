package com.doomdagger.jextractor.addon;

import java.util.Date;

import org.apache.http.cookie.Cookie;

/**
 * Simple Cookie implementation
 * @author Li He
 *
 */
public class SimpleCookie implements Cookie{
	private String name;
	private String value;
	
	public SimpleCookie(){
		
	}
	
	public SimpleCookie(String name, String value){
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String getComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCommentURL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getExpiryDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getPorts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public int getVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isExpired(Date arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPersistent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSecure() {
		// TODO Auto-generated method stub
		return false;
	}

}
