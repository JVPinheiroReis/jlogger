package com.example.jlogger.warning;

import com.example.jlogger.loggertemplate.BasicLoggerTemplate;
import com.example.jlogger.util.ANSIColor;

public class BasicWarningLogger extends BasicLoggerTemplate {
    public BasicWarningLogger() {
        super("WARNING");
        this.setForegroundColor(ANSIColor.YELLOW);
    }
}
