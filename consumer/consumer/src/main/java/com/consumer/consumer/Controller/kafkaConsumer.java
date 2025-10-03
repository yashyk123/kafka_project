//package com.consumer.consumer.Controller;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class kafkaConsumer {
//    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
//    public void Listen1(String message)
//    {
//        System.out.println("Received message 1: "+ message);
//    }
//
//    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
//    public void Listen2(String message)
//    {
//        System.out.println("Received message 2: "+ message);
//    }
//
//    @KafkaListener(topics = "my-new-Topic-2", groupId = "my-new-group-rider")
//    public void ListenRiderLocation(RiderLocation location)
//    {
//        System.out.println("Received location: "+ location.getRiderId() + " : " + location.getLatitude() + " : " + location.getLongitude());
//    }
//}
