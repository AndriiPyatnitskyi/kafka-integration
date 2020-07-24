package com.codenotfound.kafka.consumer;

import java.util.concurrent.CountDownLatch;

import com.codenotfound.model.OrderState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import com.codenotfound.model.Car;

public class Receiver {

  private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

  private CountDownLatch latch = new CountDownLatch(1);

  public CountDownLatch getLatch() {
    return latch;
  }

  @KafkaListener(topics = "${kafka.topic.json}")
  public void receive(OrderState orderState) {
    LOGGER.info("!!!!!!!!!!!!!! => received orderState='{}'", orderState.toString());
    latch.countDown();
  }
}
