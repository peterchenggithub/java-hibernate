package com.peter.model.entity;

import com.peter.system.main.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.*;

public class EntityTest {

    private EntityManager em;

    @Before
    public void init(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "hibernate-persistence-unit" );
        em = emf.createEntityManager();
    }

    @Test
    public void person(){
        Person p = Main.save(em);
        Person p1 = em.find(Person.class, 1);
        Assert.assertEquals(p1.getFirstName(), p.getFirstName());
    }
}
