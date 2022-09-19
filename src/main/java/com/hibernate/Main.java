package com.hibernate;

import com.hibernate.HibernateUtil;
import com.hibernate.entity.User;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;

@Log4j2
public class Main {
    public static void main(String[] args) {

        log.info("Hibernate tutorial");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        User user = new User();
        user.setEmail("nic7@mail.com");
        user.setUsername("Alex");
        user.setPassword("n114343567888");

        session.save(user);
        session.getTransaction().commit();
        System.out.println("user.getId() = " + user.getId());
        session.close();
        HibernateUtil.close();

    }
}
