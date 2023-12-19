package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Flower.Flower;
import com.example.demo.Flower.FlowerColor;

@RestController
@SpringBootApplication
public class DemoApplication {

    @GetMapping("/Flowers")
    public Flower[] allFlowers() {
        Flower[] flowers = new Flower[2];
        flowers[0] = new Flower("Magnolia", 20, FlowerColor.RED);
        flowers[1] = new Flower("Belucci", 20, FlowerColor.RED);
        return flowers;
    }

    @GetMapping("/PostDelivery")
    public String postDelivery(){
        return "You have successfully chosen post delivery as a delivery method";
    }

    @GetMapping("/DHLDelivery")
    public String DHLDelivery(){
        return "You have succesfully chosen post delivery as a delivery method";
    }

    @GetMapping("/")
    public String hehe(){
        return "Hello hehe";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
