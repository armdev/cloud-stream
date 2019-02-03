package io.project.first.first;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
public class DataSender {

    @Autowired
    private Source source;

    public boolean send(DataModel order) {
        return this.source.output().send(MessageBuilder.withPayload(order).build());
    }
    
    
    

}