package util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY
            =Persistence.createEntityManagerFactory("unit");


    public static  EntityManagerFactory getEntityManagerFactory(){
        return  ENTITY_MANAGER_FACTORY;
    }

}
