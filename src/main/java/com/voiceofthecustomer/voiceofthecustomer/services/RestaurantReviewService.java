package com.voiceofthecustomer.voiceofthecustomer.services;

import com.voiceofthecustomer.voiceofthecustomer.dtos.RestaurantDto;
import com.voiceofthecustomer.voiceofthecustomer.entities.RestaurantReview;
import com.voiceofthecustomer.voiceofthecustomer.repositories.RestaurantRepository;
import com.voiceofthecustomer.voiceofthecustomer.services.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class RestaurantReviewService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Transactional()
    public RestaurantDto insertRestaurant(RestaurantDto restaurantDto) {
        RestaurantReview restaurantReview = new RestaurantReview();
        dtoToEntity(restaurantDto, restaurantReview);
        restaurantReview = restaurantRepository.save(restaurantReview);
        return new RestaurantDto(restaurantReview);
    }

    @Transactional(readOnly = true)
    public Page<RestaurantDto> getAllReviews(Pageable pageable) {
        Page<RestaurantReview> restaurantReviews = restaurantRepository.findAll(pageable);
        return restaurantReviews.map(RestaurantDto::new);
    }

    @Transactional(readOnly = true)
    public RestaurantDto findById(Long id) {
        RestaurantReview restaurantReview = restaurantRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found"));
        return new RestaurantDto(restaurantReview);
    }


    private void dtoToEntity(RestaurantDto restaurantDto, RestaurantReview restaurantReview) {
        restaurantReview.setReview(restaurantDto.getReview());
        restaurantReview.setName(restaurantDto.getName().toUpperCase().trim());
        restaurantReview.setScore(restaurantDto.getScore());
        restaurantReview.setInstant(Instant.now());
    }

}
