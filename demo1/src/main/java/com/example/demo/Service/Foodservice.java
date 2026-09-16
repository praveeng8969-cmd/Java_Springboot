package com.example.demo.Service;

import com.example.demo.Model.Food;
import com.example.demo.Repository.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Foodservice {
    @Autowired
    private FoodRepo foodRepo;
    
    public ResponseEntity<Food> addFood(Food food) {
        System.out.println("Inside Food Ordering Service...");
        return foodRepo.addFoodtoCollections(food);
    }

    public ResponseEntity<List<Food>> getAllFoods() {
        return foodRepo.getFoodsFromCollection();
    }
   
}