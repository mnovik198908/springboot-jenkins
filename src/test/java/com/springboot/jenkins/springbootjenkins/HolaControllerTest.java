package com.springboot.jenkins.springbootjenkins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

public class HolaControllerTest {

    HolaController holaController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        holaController= new HolaController();
    }

    @Test
    public void holaMundo() throws Exception {
        MockMvc mockMvc= MockMvcBuilders.standaloneSetup(holaController).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/holaMundo"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


}