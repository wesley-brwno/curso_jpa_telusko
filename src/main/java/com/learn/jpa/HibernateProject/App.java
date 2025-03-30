package com.learn.jpa.HibernateProject;


import com.learn.jpa.relatios.LapTop;
import com.learn.jpa.relatios.Student;
import com.learn.jpa.telusko.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {
    public static void main(String[] args) {

        LapTop lapTop = new LapTop();
        lapTop.setLid(101);
        lapTop.setLname("Dell");

        Student student = new Student();
        student.setName("Ekko");
        student.setMarks(50);
        student.setRollno(1);


        Configuration configuration = new Configuration()
                .configure()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(LapTop.class)
                .addAnnotatedClass(Student.class);

        ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();

        SessionFactory sf = configuration.buildSessionFactory(reg);

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(lapTop);
        session.save(student);

        tx.commit();
    }
}
