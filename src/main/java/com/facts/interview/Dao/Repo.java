package com.facts.interview.Dao;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class Repo {


    public List<Integer> getCopySum() {
        return Arrays.asList(2,1,3,4,5);
    }


}
