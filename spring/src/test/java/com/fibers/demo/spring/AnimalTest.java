package com.fibers.demo.spring;

import com.fibers.demo.spring.config.AnimalConfig;
import com.fibers.demo.spring.model.IAnimal;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AnimalConfig.class)
public class AnimalTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private IAnimal animal;

    @Test
    public void testAnimalNotNull() {
        assertNotNull(animal);
        System.out.println(animal);
    }

    @Test
    public void testAnimalRun() {
        animal.run();
        assertEquals("Tiger is running",
                systemOutRule.getLog()
        );
    }
}
