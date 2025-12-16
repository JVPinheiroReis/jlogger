package com.example.jlogger.info;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.jlogger.util.ANSIColor;

public class BasicInfoLoggerTest {

    String tag = "INFO";
    String mensage = "Test BasicErrorLogger format mensage";
    String foregroundColor = ANSIColor.BLUE;

    private final BasicInfoLogger logger = new BasicInfoLogger();

    @Test
    void shouldHaveCorrectValues() {
        assertAll("basicErrorLogger",
                () -> assertEquals(tag, logger.getTag()),
                () -> assertEquals(foregroundColor, logger.getForegroundColor()));
    }

    @Test
    void shouldFormatProperly() {
        assertEquals(logger.format(mensage),
                String.format(
                        "%s[ " + tag + " at %s ] " + mensage + "%s",
                        foregroundColor,
                        logger.getTimestamp(),
                        ANSIColor.RESET));
    }

}
