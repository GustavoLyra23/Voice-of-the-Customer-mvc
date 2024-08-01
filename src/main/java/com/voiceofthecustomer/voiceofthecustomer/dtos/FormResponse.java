package com.voiceofthecustomer.voiceofthecustomer.dtos;

public class FormResponse {
    private String event_id;
    private String event_type;
    private FormResponseData form_response;

    // Getters e Setters
    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public FormResponseData getForm_response() {
        return form_response;
    }

    public void setForm_response(FormResponseData form_response) {
        this.form_response = form_response;
    }
}
