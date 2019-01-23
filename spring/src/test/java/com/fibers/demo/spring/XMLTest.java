package com.fibers.demo.spring;

import com.fibers.demo.spring.pojo.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class XMLTest {

    @Autowired
    private User user;

    @Test
    public void testUserNotNull() {
        assertNotNull(user);
    }

    @Test
    public void testUserName() {
        assertEquals(user.getName(), "shengyuhong");
    }

    @Test
    public void testUserContact() {
        assertEquals(user.getContact().getEmail(), "yu8582@126.com");
    }
}
