package com.example.demo.controller;

import com.example.demo.Model.Food;
import com.example.demo.Service.Foodservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class Foodcontroller {

    private final Foodservice foodservice;

    public Foodcontroller(Foodservice foodservice) {
        this.foodservice = foodservice;
    }

    @PostMapping("/add")
    public ResponseEntity<Food> addFood(@RequestBody Food food) {
        return foodservice.addFood(food);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Food>> getAllFoods() {
        return foodservice.getAllFoods();
    }
}