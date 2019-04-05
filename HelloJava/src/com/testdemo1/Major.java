package com.testdemo1;

public class Major {
    private String majorName;
    private int id;
    private String year;

    public Major() {

    }

    public Major(String majorName,int id,String year) {
        setId(id);
        setMajorName(majorName);
        setYear(year);
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
