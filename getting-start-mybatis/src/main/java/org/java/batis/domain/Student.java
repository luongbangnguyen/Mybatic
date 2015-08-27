package org.java.batis.domain;

import java.util.Date;

/**
 * Created by luongbangnguyen on 24/08/2015.
 */
public class Student {
    private Integer studId;
    private String name;
    private String email;
    private PhoneNumber phone;
    private Date dob;
    private byte[] pic;
    private Gender gender;
    private Address address;

    public Student() {
    }

    public Student(Integer studId, String name, String email, Date dob) {
        this(name, email, dob);
        this.studId = studId;
    }

    public Student(String name, String email, Date dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(PhoneNumber phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return studId.toString() + "/" + name + "/" + email + "/" + dob.toString();
    }
}
