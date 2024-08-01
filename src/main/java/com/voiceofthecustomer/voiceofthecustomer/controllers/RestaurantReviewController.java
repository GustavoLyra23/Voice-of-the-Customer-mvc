package com.voiceofthecustomer.voiceofthecustomer.controllers;

import com.voiceofthecustomer.voiceofthecustomer.dtos.RestaurantDto;
import com.voiceofthecustomer.voiceofthecustomer.services.RestaurantReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/reviews")
public class RestaurantReviewController {

    @Autowired
    private RestaurantReviewService restaurantReviewService;

    @GetMapping
    public ResponseEntity<Page<RestaurantDto>> getAllRestaurantReviews(Pageable pageable) {
        Page<RestaurantDto> dtos = restaurantReviewService.getAllReviews(pageable);
        return ResponseEntity.ok(dtos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<RestaurantDto> getRestaurantReviewById(@PathVariable Long id) {
        RestaurantDto dto = restaurantReviewService.findById(id);
        return ResponseEntity.ok(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<RestaurantDto> updateRestaurantReview(@PathVariable Long id, @RequestBody RestaurantDto dto) {
        //TODO
        return null;
    }


}
