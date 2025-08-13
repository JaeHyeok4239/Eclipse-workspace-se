package com.itwill04.array.academy;

public class AcademyMember {
	
		  private int no;
		    private String name;

		    public AcademyMember(int no, String name) {
		        this.no = no;
		        this.name = name;
		    }

		    public int getNo() {
		        return no;
		    }

		    public String getName() {
		        return name;
		    }

		    @Override
		    public String toString() {
		        return no + "\t" + name;
		    }
		}