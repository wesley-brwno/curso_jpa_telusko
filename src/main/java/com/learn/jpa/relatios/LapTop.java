package com.learn.jpa.relatios;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class LapTop {

    @Id
    private int lid;
    private String lname;

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

    @Entity
    @Table(name = "t_student")
    public static class Student {

        @Id
        private int rollno;
        private String name;
        private int marks;

        public int getRollno() {
            return rollno;
        }

        public void setRollno(int rollno) {
            this.rollno = rollno;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollno=" + rollno +
                    ", name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }
    }
}
