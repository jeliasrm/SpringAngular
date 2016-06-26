package com.spring.springangular;

import com.spring.springangular.controller.rest.BlogEntryController;
import com.spring.springangular.core.service.BlogEntryService;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by Jelias on 18/06/2016.
 */
public class BlogEntryControllerTest {

    @InjectMocks
    private BlogEntryController blogEntryController;

    @Mock
    private BlogEntryService blogEntryService;

    private MockMvc mockMvc;

    @Before
    public void setup(){

        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(blogEntryController).build();

    }

//    @Test
//    public void getExistingBlogEntry() throws Exception{
//        BlogEntry blogEntry = new BlogEntry();
//        blogEntry.setTitle("Test Title");
//        blogEntry.setId(1L);
//
//        when(blogEntryService.find(1L).thenReturn(blogEntry));
//
//        mockMvc.perform(get("/rest/blog-entries/1"))
//                .andExpect(jsonPath("$.title", is(blogEntry.getTitle())))
//                .andExpect(jsonPath("$.lnks[*].href", hasItem(endsWith("/blog-entries/1"))))
//                .andExpect(status().isOk());
//    }



    /*@Test
    public void test() throws Exception {

        mockMvc.perform(get("/test")).andDo(print());

    }*/

}
