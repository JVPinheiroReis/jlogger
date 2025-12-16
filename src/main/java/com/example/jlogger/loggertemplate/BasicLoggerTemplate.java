package com.example.jlogger.loggertemplate;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDateTime;

import com.example.jlogger.util.ANSIColor;

@Getter
@Setter
public abstract class BasicLoggerTemplate implements LoggerTemplate {
    private String timestamp;
    private String foregroundColor;
    private String backgroundColor;
    private String tag;

    public BasicLoggerTemplate(@NonNull String tag) {
        this.timestamp = LocalDateTime.now().toString();
        this.foregroundColor = "";
        this.backgroundColor = "";
        this.tag = tag;
    }

    @Override
    public String format(@NonNull String mensage) {
        return String.format("%s%s[ %s at %s ] %s%s",
                this.foregroundColor,
                this.backgroundColor,
                this.tag,
                this.timestamp,
                mensage,
                ANSIColor.RESET);
    }

    @Override
    public void log(@NonNull String mensage) {
        IO.println(this.format(mensage));
    }
}
