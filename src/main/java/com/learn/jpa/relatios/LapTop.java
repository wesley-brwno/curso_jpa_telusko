package com.learn.jpa.relatios;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class LapTop {

    @Id
    private int lid;
    private String lname;
    @ManyToMany(mappedBy = "lapTops")
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                '}';
    }
}
