package com.peter.system.main;

import com.peter.model.entity.Person;

import javax.persistence.*;

public class Main {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "hibernate-persistence-unit" );
        EntityManager em = emf.createEntityManager();
        save(em);
        find(em);
        System.exit(0);
    }

    public static void save( EntityManager em){


        Person p = new Person();
        p.setId(1);
        p.setFirstName("peter");
        p.setLastName("cheng");
        em.persist(p);

    }

    public static void find( EntityManager em){

        Person p1 = em.find(Person.class, 1);
        System.out.println("person name : " + p1.getFirstName());
    }
}
