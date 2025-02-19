package com.FrameWorks;
public class Student implements Comparable<Student> {
			private Integer stid;
			private String stname;
			public Integer getStid() {
				return stid;
			}
			public void setStid(Integer stid) {
				this.stid = stid;
			}
			public String getStname() {
				return stname;
			}
			public void setStname(String stname) {
				this.stname = stname;
			}
			public Student(Integer stid, String stname) {
				super();
				this.stid = stid;
				this.stname = stname;
			}
			public Student()
			{
				
			}
			@Override
			public String toString()
			{
				return stid +  " " + stname;
			}
			@Override
			public int compareTo(Student o) {
				
				/*
				 * if(this.getStid()>o.getStid()) { return -4; } else if(this.getStid() <
				 * o.getStid()) { return +7; } else { return 0; }
				 */
				
				//return o.getStid().compareTo(this.getStid());
			
			     return -this.getStname().compareTo(o.getStname());
			     
			     //here we r declaring - so we r getting the output as in descending order
			     //if we remove the - then the output will be in the asc order based on the stname
			}
		 
		}
		 
	