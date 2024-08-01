package com.voiceofthecustomer.voiceofthecustomer.dtos;

public class DtoFactory {

    public static RestaurantDto restaurantDto(FormResponse formResponse) {
        RestaurantDto dto = new RestaurantDto(null, formResponse.getForm_response().getAnswers().get(0).getText(),
                (Integer) formResponse.getForm_response().getAnswers().get(1).getNumber(),
                formResponse.getForm_response().getAnswers().get(2).getText());
        return dto;
    }


}
