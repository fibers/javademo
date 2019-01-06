package com.fibers.demo.spring;

import com.fibers.demo.spring.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class UserTest {

    @Autowired
    private User user;

    @Test
    public void testUserNotBeNull(){
        assertNotNull(user);
        System.out.println(user);
    }
}
