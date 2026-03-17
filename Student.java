package com.sms.student_management.model;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private String course;
    private String semester;
    private String email;
    private String phone;
    private String address;
    private String enrollmentDate;
    private String status;

    public Student(){}

    public int getId(){ return id; }
    public void setId(int id){ this.id=id; }

    public String getFirstName(){ return firstName; }
    public void setFirstName(String firstName){ this.firstName=firstName; }

    public String getLastName(){ return lastName; }
    public void setLastName(String lastName){ this.lastName=lastName; }

    public String getGender(){ return gender; }
    public void setGender(String gender){ this.gender=gender; }

    public String getDob(){ return dob; }
    public void setDob(String dob){ this.dob=dob; }

    public String getCourse(){ return course; }
    public void setCourse(String course){ this.course=course; }

    public String getSemester(){ return semester; }
    public void setSemester(String semester){ this.semester=semester; }

    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email=email; }

    public String getPhone(){ return phone; }
    public void setPhone(String phone){ this.phone=phone; }

    public String getAddress(){ return address; }
    public void setAddress(String address){ this.address=address; }

    public String getEnrollmentDate(){ return enrollmentDate; }
    public void setEnrollmentDate(String enrollmentDate){ this.enrollmentDate=enrollmentDate; }

    public String getStatus(){ return status; }
    public void setStatus(String status){ this.status=status; }
}
