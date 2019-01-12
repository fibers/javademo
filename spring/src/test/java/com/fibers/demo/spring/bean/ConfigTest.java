package com.fibers.demo.spring.bean;

import com.fibers.demo.spring.config.GlobalConfig;
import com.fibers.demo.spring.iface.IAnimal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = GlobalConfig.class)
public class ConfigTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private IAnimal animal;

    @Autowired
    private User user;

    @Test
    public void testNotNull() {
        assertNotNull(animal);
        assertNotNull(user);
    }

    @Test
    public void testAnimalRun() {
        animal.run();
        assertEquals("Tiger is running",
                systemOutRule.getLog()
        );
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
