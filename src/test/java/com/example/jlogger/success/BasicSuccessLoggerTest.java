package com.example.jlogger.success;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.jlogger.util.ANSIColor;

public class BasicSuccessLoggerTest {

    String tag = "SUCCESS";
    String mensage = "Test format mensage";
    String foregroundColor = ANSIColor.GREEN;

    private final BasicSuccessLogger logger = new BasicSuccessLogger();

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
