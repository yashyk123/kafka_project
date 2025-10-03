//package com.producerDemo.producer.producer;
//
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class kafkaProducer {

    /*****************/
//    private final KafkaTemplate<String, String> kafkaTemplate;
//
//    public kafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//
//    @PostMapping("/send")
//    public String sendMessage(@RequestParam String message)
//    {
//        kafkaTemplate.send("my-topic", message);
//        return "message-sent: " + message;
//    }


    /*****************/

//    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;
//
//    public kafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//
//    @PostMapping("/send")
//    public String sendMessage(@RequestParam String message)
//    {
//        RiderLocation location = new RiderLocation("yashrider123",28.61,77.23);
//        kafkaTemplate.send("my-new-Topic-2", location);
//        return "message-sent: " + location.getRiderId();
//    }
//}
