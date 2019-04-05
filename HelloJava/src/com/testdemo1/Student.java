package com.testdemo1;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Student {
    private String name;
    private int age;
    private String sex;
    private int id;
    private String majorName;
    private String year;

    public Student() {

    }

    public Student(String name,int age,String sex,int id,Major major) {
        setAge(age);
        setId(id);
        setName(name);
        setSex(sex);
        setMajorName(major.getMajorName());
        setYear(major.getYear());
    }

//    public void zr(Major major){
//        setMajorName(major.getMajorName());
//        setYear(major.getYear());
//    }

    public void you() {
        System.out.println("============================");
        System.out.println("专业名称: "+ this.majorName);
        System.out.println("专业年限： "+ this.year);
        System.out.println(this.name);
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
