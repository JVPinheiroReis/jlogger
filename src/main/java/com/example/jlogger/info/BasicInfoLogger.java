package com.example.jlogger.info;

import com.example.jlogger.loggertemplate.BasicLoggerTemplate;
import com.example.jlogger.util.ANSIColor;

public class BasicInfoLogger extends BasicLoggerTemplate {
    public BasicInfoLogger() {
        super("INFO");
        this.setForegroundColor(ANSIColor.BLUE);
    }
}
