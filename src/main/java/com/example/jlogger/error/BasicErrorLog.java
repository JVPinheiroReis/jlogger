package com.example.jlogger.error;

import com.example.jlogger.logtemplate.BasicLogTemplate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BasicErrorLog extends BasicLogTemplate {
    private String errorCode;
    private String stackTrace;

    public BasicErrorLog(String mensage, String errorCode, Throwable throwable) {
        if (mensage == null) {
            mensage = "Some error ocurred";
        }

        super("ERROR", mensage);
        this.errorCode = errorCode;
        this.stackTrace = throwable != null ? throwable.toString() : "N/A";
    }
}
