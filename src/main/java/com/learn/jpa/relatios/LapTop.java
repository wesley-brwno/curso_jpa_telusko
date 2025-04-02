package com.learn.jpa.relatios;

import com.learn.jpa.telusko.Alien;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class LapTop {

    @Id
    private int lid;
    private String lname;
    @ManyToOne
    private Alien alien;

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
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
