package io.project.app;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
@Slf4j
public class DataSender {

    @Autowired
    private Source source;

    @Async
    public boolean send(DataModel order) {
        // for(int i = 0; i < 10000 ; i++){
        boolean send = this.source.output().send(MessageBuilder.withPayload(order).build());
        log.info("Data send " + send);
       // }
        return false;
    }
    
    
    

}