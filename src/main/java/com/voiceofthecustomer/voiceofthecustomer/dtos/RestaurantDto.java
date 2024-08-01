package com.voiceofthecustomer.voiceofthecustomer.dtos;

import com.voiceofthecustomer.voiceofthecustomer.entities.RestaurantReview;

public class RestaurantDto {

    private Long id;
    private String name;
    private Integer score;
    private String review;

    public RestaurantDto() {
    }

    public RestaurantDto(Long id, String name, Integer score, String review) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.review = review;
    }

    public RestaurantDto(RestaurantReview restaurantReview) {
        id = restaurantReview.getId();
        name = restaurantReview.getName();
        score = restaurantReview.getScore();
        review = restaurantReview.getReview();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    public String getReview() {
        return review;
    }
}
