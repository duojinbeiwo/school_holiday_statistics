package com.example.holidaystatistics.entity;

import com.example.holidaystatistics.model.UserFromModel;

import javax.persistence.*;

/**
 * 学生信息表
 *
 * @author 马小生
 */
@Entity
public class Student {
    @Id
    @Column(nullable = false, length = 10)
    private String studentId;

    @Column(nullable = false)
    private String studentName;

    @Column(nullable = false)
    private String password;

    @Column(length = 11)
    private String phone;

    @Column(unique = true)
    private String email;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
