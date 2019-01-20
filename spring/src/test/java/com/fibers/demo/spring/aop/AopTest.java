package com.fibers.demo.spring.aop;

import com.fibers.demo.spring.config.GlobalConfig;
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
public class AopTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private Performance performance;

    @Test
    public void testNotNull() {
        assertNotNull(performance);
    }

    @Test
    public void testAOPRound() {
        performance.perform_namedPointcut();
        assertEquals("Silencing cell phones\n" +
                "Taking seats\n" +
                "Singing a song\n" +
                "CLAP CLAP CLAP\n", systemOutRule.getLog());
    }

    @Test
    public void testAOPIntroducer() {
        ((Extension) performance).extension();
        assertEquals("Clean\n",
                systemOutRule.getLog());
    }

}
