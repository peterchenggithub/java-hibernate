package com.peter.system.main;

import com.peter.model.entity.Person;
import com.peter.model.entity.association.Child;
import com.peter.model.entity.association.Parent;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "hibernate-persistence-unit" );
        EntityManager em = emf.createEntityManager();
        Person p = save(em);
        p.setFirstName("peterson");
        find(em);
        System.exit(0);
    }

    public static Person save( EntityManager em){


        Person p = new Person();
//        p.setId(1);
        p.setFirstName("peter");
        p.setLastName("cheng");
        em.persist(p);




        createParent(em);

        return p;

    }

    public static void find( EntityManager em){

        Person p1 = em.find(Person.class, 1);
        System.out.println("person name : " + p1.getFirstName());

        Parent p2 = em.find(Parent.class, "1");
        System.out.println("parent name : " + p2.getName());
        System.out.println("no. of child : " + p2.getChildren().size());
        System.out.println("parent id of child : " + p2.getChildren().get(0).getId());
    }

    public static void createParent(EntityManager em){
        Parent p = new Parent();
        p.setId("1");
        p.setName("Father");

        Child c = new Child();
        c.setId("1");
        c.setName("kid");

        Child c2 = new Child();
        c2.setId("2");
        c2.setName("kid 2");

        List<Child> cList = new ArrayList<Child>();
        cList.add(c);
        cList.add(c2);
        p.setChildren(cList);
        em.persist(p);
    }
}
