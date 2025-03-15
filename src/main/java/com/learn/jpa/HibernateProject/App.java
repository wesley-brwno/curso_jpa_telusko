package com.learn.jpa.HibernateProject;


import com.learn.jpa.telusko.Alian;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {
    public static void main(String[] args) {
        Alian telusko = new Alian();
        telusko.setAid(104);
        telusko.setAname("Nibbler");
        telusko.setColor("Black");

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alian.class);

        ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();

        SessionFactory sf = configuration.buildSessionFactory(reg);

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(telusko);

        tx.commit();
    }
}
