package com.fibers.demo.spring.controller;

import com.fibers.demo.spring.model.Spitter;
import com.fibers.demo.spring.repository.SpitterRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SpitterControllerTest {

    private SpitterRepository spitterRepository;

    @Autowired
    public void setSpitterRepository(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @Test
    public void shouldShowRegistration() throws Exception {
        SpitterController controller = new SpitterController(spitterRepository);

        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }

    @Test
    public void shouldProcessRegistration() throws Exception {

        SpitterRepository mockRepository = mock(SpitterRepository.class);

        Spitter unsaved = new Spitter(null, "jbauer", "24hours", "Jack", "Bauer");
        Spitter saved = new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer");

        when(mockRepository.save(unsaved)).thenReturn(saved);

        SpitterController controller = new SpitterController(mockRepository);

        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(post("/spitter/register")
                .param("firstName", "Jack")
                .param("lastName", "Bauer")
                .param("username", "jbauer")
                .param("password", "24hours"))
                .andExpect(redirectedUrl("/spitter/jbauer"));

        verify(mockRepository, atLeastOnce()).save(unsaved);
    }
}