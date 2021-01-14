package io.project.second;

import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.support.AmqpHeaders;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Slf4j
public class DataSender {

    @StreamListener(Sink.INPUT)
    public void onDataPublished(@Payload DataModel p,
            //@Header(AmqpHeaders.CHANNEL) Channel channel,
            @Header(AmqpHeaders.DELIVERY_TAG) Long deliveryTag) throws IOException {

        log.info("deliveryTag " + deliveryTag);
       // channel.basicAck(deliveryTag, true);
        log.info("Received with id " + p.getId());
    }

}
