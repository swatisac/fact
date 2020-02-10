package com.facts.interview.controller;



import com.facts.interview.Model.FactsModel;

import com.facts.interview.service.FactsService;
import com.facts.interview.service.Impl.FactsServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import javax.validation.Valid;
import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@CrossOrigin
public class Controller {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    FactsService factsService;
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/getFacts", method = RequestMethod.GET)
     public FactsModel getFacts() throws IOException {
        System.out.println("");
        FactsModel fc =new FactsModel();
      //  String uri= "http://localhost:8080/facts";
        String uri=  "http://localhost:8080/facts/299f7aa9-06c6-4ee1-a5f3-d125304d77ba";
        //RestTemplate res = new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        header.setBasicAuth("admin","admin");
        header.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity entity= new HttpEntity(header);
        ResponseEntity<String> response  = restTemplate.exchange(uri,HttpMethod.GET,entity,String.class);

        SimpleFilterProvider filterProvider = new SimpleFilterProvider();
        filterProvider.addFilter("myProvider",
                SimpleBeanPropertyFilter.filterOutAllExcept("id", "text"));
        ObjectMapper om = new ObjectMapper();
        om.setFilterProvider(filterProvider);
        //om.writeValue(fcm,FactsModel.class);
      //
         FactsModel factsModel = om.readValue(response.getBody(),FactsModel.class);
        factsService.creatingFile(factsModel);
        return factsModel;
    }


    @RequestMapping(value= "/putMethod",method= RequestMethod.PUT)
    void putMethos(FactsModel factsModel){



    }

    @RequestMapping(value= "/postMethod",method= RequestMethod.POST)
    void PostMethod(@RequestBody FactsModel factsModel){

        System.out.println(factsModel);

    }
    @PostMapping(value= "/postMethodTest",consumes = MediaType.APPLICATION_XML_VALUE )
    void PostMethodTest(@Valid @RequestBody FactsModel factsModel){

        System.out.println(factsModel);

    }
    @RequestMapping(value= "/getMethod/{id}",method= RequestMethod.GET)
    void getMethod(@PathVariable String id){

        System.out.println(id);

    }
    @RequestMapping(value= "/helloworld",method= RequestMethod.GET)
  public  String getMethod(){

        return "hello world";

    }
}
