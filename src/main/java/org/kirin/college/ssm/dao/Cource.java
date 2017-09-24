package org.kirin.college.ssm.dao;

public class Cource {
    private Integer id;

    private String name;

    private Short credit;

    private Short lession_hour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getCredit() {
        return credit;
    }

    public void setCredit(Short credit) {
        this.credit = credit;
    }

    public Short getLession_hour() {
        return lession_hour;
    }

    public void setLession_hour(Short lession_hour) {
        this.lession_hour = lession_hour;
    }
}