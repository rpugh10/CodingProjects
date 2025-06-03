package com.example.util;

import jakarta.persistence.*;

public class JpaUtil {

    private static final EntityManagerFactory EMF = 
    Persistence.createEntityManagerFactory("myPersistenceUnit");

    public static EntityManager getEmf() {
        return EMF.createEntityManager();
    }

    public static void close(){
        if(EMF.isOpen()) EMF.close();
    }
}
