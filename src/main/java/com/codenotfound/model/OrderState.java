package com.codenotfound.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class OrderState {
    private int eventId;

//    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
//    private LocalDateTime eventTime;
    private int subscriberId;
    private int subscriberType;
//    private List<Param> params;
//
//    @AllArgsConstructor
//    @NoArgsConstructor
//    @Builder
//    @Getter
//    @Setter
//    @ToString
//    public static class Param {
//        private String eventType;
//        private String channel;
//        private String orderId;
//        private String orderState;
//        private String featureId;
//        private String actionType;
//    }
}
