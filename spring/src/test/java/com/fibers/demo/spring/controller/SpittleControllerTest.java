package com.fibers.demo.spring.controller;

import com.fibers.demo.spring.config.RootConfig;
import com.fibers.demo.spring.pojo.model.Spittle;
import com.fibers.demo.spring.repository.SpittleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class SpittleControllerTest {

    private SpittleRepository spittleRepository;

    @Autowired
    public void setSpittleRepository(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @Test
    public void shouldShowRecentSpittles() throws Exception {
        List<Spittle> expectedSpittles = spittleRepository.findSpittles(238900, 20);

        SpittleController controller = new SpittleController(spittleRepository);

        MockMvc mockMvc = standaloneSetup(controller).setSingleView(
                new InternalResourceView("/views/spittles.jsp")
        ).build();

        mockMvc.perform(get("/spittles?max=238900&count=50"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList",
                        hasItems(expectedSpittles.toArray())));
    }
}