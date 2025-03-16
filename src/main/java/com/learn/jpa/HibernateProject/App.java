package com.learn.jpa.HibernateProject;


import com.learn.jpa.telusko.AlianName;
import com.learn.jpa.telusko.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {
    public static void main(String[] args) {
        AlianName an = new AlianName();
        an.setFname("Wesley Bruno");
        an.setLname("das Virgens");
        an.setMname("Silva");


        Alien telusko = new Alien();
        telusko.setAid(101);
        telusko.setColor("Black");
        telusko.setAname(an);


        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);

        ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();

        SessionFactory sf = configuration.buildSessionFactory(reg);

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(telusko);


        tx.commit();

        System.out.println(telusko);
    }
}
