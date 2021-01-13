package main;

import hibernate.dao.RoomsEntity;
import hibernate.utils.HibernateSessionFactory;
import org.hibernate.Session;

public class AppMain {

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        /*
        session.beginTransaction();
        RoomsEntity roomsEntity = new RoomsEntity();
        roomsEntity.setCapacity(2);
        roomsEntity.setComfortable("Люкс");
        roomsEntity.setNumber("1000");
        session.save(roomsEntity);
        session.getTransaction().commit();
        */

        session.close();


    }
}
