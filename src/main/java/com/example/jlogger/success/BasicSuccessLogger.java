package com.example.jlogger.success;

import com.example.jlogger.loggertemplate.BasicLoggerTemplate;
import com.example.jlogger.util.ANSIColor;

public class BasicSuccessLogger extends BasicLoggerTemplate {
    public BasicSuccessLogger() {
        super("SUCCESS");
        this.setForegroundColor(ANSIColor.GREEN);
    }
}
