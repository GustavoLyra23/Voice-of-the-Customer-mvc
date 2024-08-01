package com.voiceofthecustomer.voiceofthecustomer.dtos;

import java.util.List;

public class FormResponseData {
    private String form_id;
    private String token;
    private String landed_at;
    private String submitted_at;
    private Definition definition;
    private List<Answer> answers;
    private Ending ending;

    // Getters e Setters
    public String getForm_id() {
        return form_id;
    }

    public void setForm_id(String form_id) {
        this.form_id = form_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLanded_at() {
        return landed_at;
    }

    public void setLanded_at(String landed_at) {
        this.landed_at = landed_at;
    }

    public String getSubmitted_at() {
        return submitted_at;
    }

    public void setSubmitted_at(String submitted_at) {
        this.submitted_at = submitted_at;
    }

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Ending getEnding() {
        return ending;
    }

    public void setEnding(Ending ending) {
        this.ending = ending;
    }
}
