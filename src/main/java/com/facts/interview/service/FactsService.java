package com.facts.interview.service;

import com.facts.interview.Model.FactsModel;

import java.io.IOException;

public interface FactsService {

    String creatingFile(FactsModel model) throws IOException;

    void testNoargMockito() ;

    FactsModel testArgMockito(FactsModel s) throws IOException;

    Integer sum();



}
