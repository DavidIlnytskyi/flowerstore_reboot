package com.example.demo.Flower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication @RestController @RequestMapping("/flowers")
public class FlowerController {

    private List<Flower> flowerList = Arrays.asList(
        new Flower("Rose", 15, FlowerColor.RED),
        new Flower("Sun", 10, FlowerColor.YELLOW),
        new Flower("Davidson", 12, FlowerColor.BLUE)
    );

    @GetMapping
    public List<Flower> getAllFlowers() {
        return flowerList;
    }

    @GetMapping("/{name}")
    public Flower getFlowerByName(@PathVariable String name) {
        return flowerList.stream()
                .filter(flower -> flower.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        SpringApplication.run(FlowerController.class, args);
    }
}
