package io.project.second;


import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
@Slf4j
public class DataSender {

   
    @StreamListener(Sink.INPUT)
    public void onPersonPublished(DataModel p) throws IOException {
       log.info("Received " + p.toString());
    }

    
    
    

}