package com.codenotfound.kafka.producer;

import com.codenotfound.model.OrderState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

import com.codenotfound.model.Car;

public class Sender {

  private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

  @Value("${spring.kafka.template.default-topic}")
  private String jsonTopic;

  @Autowired
  private KafkaTemplate<String, Car> kafkaTemplate;

  public void send(Car car) {
    LOGGER.info("sending car='{}'", car.toString());
    kafkaTemplate.send(jsonTopic, car);
  }
}
