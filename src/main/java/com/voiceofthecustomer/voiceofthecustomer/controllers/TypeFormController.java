package com.voiceofthecustomer.voiceofthecustomer.controllers;

import com.voiceofthecustomer.voiceofthecustomer.dtos.RestaurantDto;
import com.voiceofthecustomer.voiceofthecustomer.services.RestaurantReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/typeform")
public class TypeFormController {

    @Autowired
    private RestaurantReviewService restaurantReviewService;

    @PostMapping
    public ResponseEntity<RestaurantDto> submitFeedback(@RequestBody RestaurantDto restaurantDto) {
        RestaurantDto dto = restaurantReviewService.insertRestaurant(restaurantDto);
        return ResponseEntity.ok(dto);
    }

}

