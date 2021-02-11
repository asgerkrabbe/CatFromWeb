package com.cat.demo;

import com.cat.demo.model.CatFact;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

@SpringBootTest
class IndexApplicationTests {


    @Test
    public void webReader() throws IOException {
        URL catURL = new URL("http://cat-fact.herokuapp.com/facts/random");
        BufferedReader inputFromCatUrl = new BufferedReader(new InputStreamReader(catURL.openStream()));
        CatFact singleCatFact = new Gson().fromJson(inputFromCatUrl, CatFact.class);
        System.out.println(singleCatFact);
        //return "" + singleCatFact;
    }
}