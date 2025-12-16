package com.example.jlogger.error;

import com.example.jlogger.loggertemplate.BasicLoggerTemplate;
import com.example.jlogger.util.ANSIColor;

public class BasicErrorLogger extends BasicLoggerTemplate {
    public BasicErrorLogger() {
        super("ERROR");
        this.setForegroundColor(ANSIColor.RED);
    }
}
