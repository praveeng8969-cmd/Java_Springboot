package com.example.demo.Repository;
import com.example.demo.Model.Food;
import org.springframework.http.ResponseEntity;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoodRepo {
    List<Food>  orderedFoods = new ArrayList<>();
    public ResponseEntity<Food> addFoodtoCollections(Food food) {
        System.out.println("Inside Food Ordering Repository...");
        orderedFoods.add(food);
        return ResponseEntity.ok(food);
    }

    public ResponseEntity<List<Food>> getFoodsFromCollection() {
        return ResponseEntity.ok(orderedFoods);
    }

}