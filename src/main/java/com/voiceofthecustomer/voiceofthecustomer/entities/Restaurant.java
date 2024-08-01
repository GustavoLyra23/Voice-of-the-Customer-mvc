package com.voiceofthecustomer.voiceofthecustomer.entities;

import java.util.UUID;

public class Restaurant {

    private UUID id;
    private String name;
    private Integer score;
    private String review;

    public Restaurant() {
    }

    public Restaurant(UUID id, String name, Number score, String review) {
        this.id = id;
        this.name = name;
        this.score = (Integer) score;
        this.review = review;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + score + " " + review;
    }
}
