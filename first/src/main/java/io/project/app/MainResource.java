package io.project.app;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author armena
 */
@RestController
@RequestMapping("/api/v2/data")
@Api("/api/v2/data")
public class MainResource {
    
    @Autowired
    private DataSender dataSender;
    
    @GetMapping("/send")
    @CrossOrigin
    public String sendDate(){
        dataSender.send(new DataModel(System.currentTimeMillis(), "user data"));
        return "done";
    }
}
