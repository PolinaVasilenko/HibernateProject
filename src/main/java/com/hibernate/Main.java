package com.hibernate;

import com.hibernate.HibernateUtil;
import com.hibernate.entity.User;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        User user = new User();
        user.setEmail("kk@mail.com");
        user.setUsername("Pole");
        user.setPassword("p1311");

        session.save(user);
        session.getTransaction().commit();
        System.out.println("user.getId() = " + user.getId());
        session.close();
        HibernateUtil.close();

    }
}
