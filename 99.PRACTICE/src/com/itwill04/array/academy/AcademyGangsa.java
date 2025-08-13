package com.itwill04.array.academy;

public class AcademyGangsa extends AcademyMember {
	 private String subject; // 과목

	    public AcademyGangsa(int no, String name, String subject) {
	        super(no, name);
	        this.subject = subject;
	    }

	    public String getSubject() {
	        return subject;
	    }

	    public void setSubject(String subject) {
	        this.subject = subject;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\t[Gangsa] 과목: " + subject;
	    }
	}