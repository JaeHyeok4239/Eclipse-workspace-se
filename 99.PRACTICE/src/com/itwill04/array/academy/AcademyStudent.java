package com.itwill04.array.academy;

public class AcademyStudent extends AcademyMember {
	 private String ban; // 반

	    public AcademyStudent(int no, String name, String ban) {
	        super(no, name);
	        this.ban = ban;
	    }

	    public String getBan() {
	        return ban;
	    }

	    public void setBan(String ban) {
	        this.ban = ban;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\t[Student] 반: " + ban;
	    }
}