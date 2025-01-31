package com.Problem;
	public abstract class User 
	{
	    protected String name;
	    protected String email;
	    protected String phoneNumber;

	    public User(String name, String email, String phoneNumber)
	    {
	        this.name = name;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	    }

	    public abstract void performRoleAction();
	}



