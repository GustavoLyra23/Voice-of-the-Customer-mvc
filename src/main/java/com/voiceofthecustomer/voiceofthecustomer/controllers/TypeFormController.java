package com.voiceofthecustomer.voiceofthecustomer.controllers;

import com.voiceofthecustomer.voiceofthecustomer.dtos.FormResponse;
import com.voiceofthecustomer.voiceofthecustomer.entities.RestaurantReview;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
@RequestMapping(value = "/typeform")
public class TypeFormController {

    @PostMapping
    public String webhook(@RequestBody FormResponse formResponse) {
        System.out.println(formResponse.getEvent_id());
        RestaurantReview res = new RestaurantReview(null, formResponse.getForm_response().getAnswers().get(0).getText(),
                formResponse.getForm_response().getAnswers().get(1).getNumber(),
                formResponse.getForm_response().getAnswers().get(2).getText(), Instant.parse(formResponse.getForm_response().getLanded_at()));
        System.out.println(res);
        return "Webhook executed successfully";
    }

    @GetMapping
    public ResponseEntity<String> createForm() {
        String http = "https://ye56d0dihdu.typeform.com/to/dQ9YM9nN";
        return ResponseEntity.ok(http);
    }

}
