/*
package com.facts.interview.facts;


import com.facts.interview.Dao.Repo;
import com.facts.interview.Model.FactsModel;
import com.facts.interview.service.FactsService;
import com.facts.interview.service.Impl.FactsServiceImpl;
import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import java.io.IOException;
import java.util.Arrays;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MyFactsTest {



    //@Rule
    //public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    Repo repo;

    @InjectMocks
    FactsService factsService= new FactsServiceImpl();

    @Before
    public void setup(){
        factsService = Mockito.spy(new FactsServiceImpl()); // Here!
    }


   */
/* @Test
    public void testCase() throws IOException {

        Assert.assertEquals("yes", factsService.testNoargMockito());
    }*//*


    @Test

    public void testCaseSum() throws IOException {
        when(repo.getCopySum()).thenReturn(Arrays.asList( 2, 3, 1));
        Assert.assertEquals((Integer) 6, factsService.sum());
    }


    @Test

    public void voidTest() throws IOException {
       // Mockito.doThrow(new RuntimeException()).when(factsService).testNoargMockito();
        doThrow(new Exception()).when(factsService).testNoargMockito();

      //  Mockito.doThrow(new Exception()).when(factsService).testNoargMockito();



    }
}
*/
