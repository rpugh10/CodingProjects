package jpa.example.util;

import jakarta.persistence.*;

public class JPAUtil {

    private static final EntityManagerFactory EMF = 
    Persistence.createEntityManagerFactory("myPersistenceUnit");

    public static EntityManager getEntityManager(){
        return EMF.createEntityManager();
    }

    public static void close()
    {
        if(EMF.isOpen()) EMF.close();
    }
}
