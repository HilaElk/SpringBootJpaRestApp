package com.example.wiki.controller;

import com.example.wiki.model.Wiki;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {
    @Autowired
    com.example.wiki.repository.WikiRepository wikiRepository;



    @RequestMapping("/findall")
    public String findAllTV(){
        String result = "";

        for(Wiki cust : wikiRepository.findAll()){
            result += cust.toString() + "<br>";
        }
        return result;
    }




    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") long id){
        String result = "";
        Wiki tvShow = wikiRepository.findById(id).get();
        if(tvShow==null)
            return "No Entity for id "+id;
        return result.toString();
    }
}
