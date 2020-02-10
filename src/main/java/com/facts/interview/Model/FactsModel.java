package com.facts.interview.Model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonFilter("myProvider")
public class FactsModel{
    private String id;
    private String text;
    private String language;
    private String permalink;

    // Getter Methods
    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getLanguage() {
        return language;
    }

    public String getPermalink() {
        return permalink;
    }

    // Setter Methods
    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    @Override
    public String toString() {
        return "FactsModel{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", language='" + language + '\'' +
                ", permalink='" + permalink + '\'' +
                '}';
    }
}
