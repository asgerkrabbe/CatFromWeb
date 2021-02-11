package com.cat.demo.service;

import com.cat.demo.model.CatFact;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Services {
    ArrayList<CatFact> tenCatFactsArray = new ArrayList<>();

    public CatFact webReader() throws IOException {
        URL catURL = new URL("http://cat-fact.herokuapp.com/facts/random");
        BufferedReader inputFromCatUrl = new BufferedReader(new InputStreamReader(catURL.openStream()));
        CatFact singleCatFact = new Gson().fromJson(inputFromCatUrl, CatFact.class);
        return singleCatFact;
    }

    public ArrayList<CatFact> tenCatFact() throws IOException {
        for (int i = 0; i < 10; i++) {
            tenCatFactsArray.add(webReader());
        }
        return tenCatFactsArray;
    }
}