package com.voiceofthecustomer.voiceofthecustomer.controllers;

import com.voiceofthecustomer.voiceofthecustomer.dtos.DtoFactory;
import com.voiceofthecustomer.voiceofthecustomer.dtos.FormResponse;
import com.voiceofthecustomer.voiceofthecustomer.dtos.RestaurantDto;
import com.voiceofthecustomer.voiceofthecustomer.services.RestaurantReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/typeform")
public class TypeFormController {

    @Autowired
    private RestaurantReviewService restaurantReviewService;

    @PostMapping
    public ResponseEntity<RestaurantDto> webhook(@RequestBody FormResponse formResponse) {
        RestaurantDto restaurantDto = restaurantReviewService.insertRestaurant(DtoFactory.restaurantDto(formResponse));
        return ResponseEntity.ok(restaurantDto);
    }

    @GetMapping
    public ResponseEntity<String> createForm() {
        String http = "https://ye56d0dihdu.typeform.com/to/dQ9YM9nN";
        return ResponseEntity.ok(http);
    }

}

