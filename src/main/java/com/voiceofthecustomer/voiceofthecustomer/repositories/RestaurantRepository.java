package com.voiceofthecustomer.voiceofthecustomer.repositories;

import com.voiceofthecustomer.voiceofthecustomer.entities.RestaurantReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantReview, Long> {
}
