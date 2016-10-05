/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import streaming.entity.Personne;
import streaming.service.PersonneServiceCRUD;
import streaming.spring.SpringConfig;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class PersonneServiceCRUDTest {

    @Autowired
    private PersonneServiceCRUD service;

    @Before
    public void avant() {
        service.deleteAll();
        Personne p = new Personne();
        p.setNom("aaa");
        p.setPrenom("bbbb");
        service.save(p);
        
        p=new Personne();
        p.setNom("ccc");
        p.setPrenom("ddd");
        service.save(p);
    }

    @Test
    public void testfin() {

        service.findOneByPrenomAndNom("aaa", "bbb");
       
    }

    @Test
    public void test1() {

        Personne per = new Personne();
        per.setNom("FRANCSOIS");
        service.save(per);
    }

    @Test
    public void test2() {

        service.findAll();
    }
}
