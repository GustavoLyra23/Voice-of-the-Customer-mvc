package com.voiceofthecustomer.voiceofthecustomer.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_restaurant")
public class RestaurantReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer score;
    private String review;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant instant;


    public RestaurantReview() {
    }

    public RestaurantReview(Long id, String name, Number score, String review, Instant instant) {
        this.id = id;
        this.name = name;
        this.score = (Integer) score;
        this.review = review;
        this.instant = instant;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + score + " " + review + " " + instant;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Instant getInstant() {
        return instant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantReview that = (RestaurantReview) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }
}
