/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.first.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author armena
 */
@RestController
@RequestMapping("/api/v2/data")
public class MainResource {
    
    @Autowired
    private DataSender dataSender;
    
    @GetMapping
    public String sendDate(){
        dataSender.send(new DataModel(System.currentTimeMillis(), "user data"));
        return "done";
    }
}
