package com.learn.jpa.telusko;

import com.learn.jpa.relatios.LapTop;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Alien {

    @Id
    private int aid;
    private AlianName aname;
    private String color;
    @OneToMany(mappedBy = "alien", fetch = FetchType.EAGER)
    private Collection<LapTop> laps = new ArrayList<>();

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
