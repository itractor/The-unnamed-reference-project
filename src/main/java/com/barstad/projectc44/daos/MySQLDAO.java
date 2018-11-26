package com.barstad.projectc44.daos;

import com.barstad.projectc44.Models.UserProfileEntity;
import com.barstad.projectc44.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MySQLDAO implements Database {
    Session session;
    public void openConnection() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        this.session = sessionFactory.openSession();
    }
    public UserProfileEntity saveUserProfile(UserProfileEntity userProfile) {
        this.session.beginTransaction();
        this.session.save(userProfile);
        this.session.getTransaction().commit();
        return userProfile;
    }
    public void closeConnection() {
        this.session.close();
    }
}
