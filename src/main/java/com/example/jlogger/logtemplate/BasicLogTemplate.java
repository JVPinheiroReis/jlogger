package com.example.jlogger.logtemplate;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class BasicLogTemplate implements LogTemplate {
    private String timestamp;
    private String tag;
    private String mensage;

    public BasicLogTemplate() {
        this.timestamp = LocalDateTime.now().toString();
    }

    public BasicLogTemplate(String tag, String mensage) {
        this();
        this.tag = tag;
        this.mensage = mensage;
    }

    @Override
    public void print() {
        System.out.println("[ " + this.timestamp + " " + this.tag + " ] " + this.mensage);
    }
}
