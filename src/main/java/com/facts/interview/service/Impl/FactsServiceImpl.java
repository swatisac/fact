package com.facts.interview.service.Impl;


import com.facts.interview.Dao.Repo;
import com.facts.interview.Model.FactsModel;
import com.facts.interview.service.FactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
//@PropertySource("classpath:foo.properties")
public class FactsServiceImpl implements FactsService {
    private String PATH = "/Users/navneetsingh/Documents/swati projects/facts/src/main/resources/factsData.csv";
    @Value("${spring.application.name}")
    String App_nam;
  @Autowired
  Repo repo;

    @Override
    public String creatingFile(FactsModel model) throws IOException {
        File f = new File(PATH);
        FileWriter fw = new FileWriter(PATH);

        System.out.println(App_nam);
        //try(FileWriter fw = new FileWriter(PATH)){
        try(  BufferedWriter bw = new BufferedWriter(fw)){

           List<String> list = Arrays.asList(model.getId(), model.getLanguage(),model.getPermalink(),model.getText());
           String rec= String.join(",",list);
            //fw.write(rec);
            bw.write(rec);

        }
        System.out.println(f.getName());
        return null;
    }

    @Override
    public void testNoargMockito()  {
        System.out.println("return type void");
       // return "yes";
    }

    @Override
    public FactsModel testArgMockito(FactsModel s) throws IOException {
        FactsModel fs=  new FactsModel();
        fs.setId("id");
        fs.setLanguage("lanf");
        return new FactsModel();

    }

    @Override
    public Integer sum() {
  List<Integer>  sum =repo.getCopySum();
        Integer sums;
    // sums= sum.stream().collect(Collectors.summingInt(Integer::intValue));
        sums=   sum.stream().reduce(0, (a,b)->a+b);
        return sums;
    }




}
