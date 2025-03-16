package com.learn.jpa.telusko;

import jakarta.persistence.*;

@Entity
@Table(name = "alien_table_2")
public class Alien {

    @Id
    private int aid;
    private AlianName aname;
    private String color;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public AlianName getAname() {
        return aname;
    }

    public void setAname(AlianName aname) {
        this.aname = aname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
