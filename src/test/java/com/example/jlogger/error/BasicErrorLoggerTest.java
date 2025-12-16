package com.example.jlogger.error;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.jlogger.util.ANSIColor;

public class BasicErrorLoggerTest {

    String tag = "ERROR";
    String foregroundColor = ANSIColor.RED;

    private final BasicErrorLogger logger = new BasicErrorLogger();

    @Test
    void shouldHaveCorrectValues() {
        assertAll("basicErrorLogger",
                () -> assertEquals(tag, logger.getTag()),
                () -> assertEquals(foregroundColor, logger.getForegroundColor()));
    }

    @Test
    void shouldFormatProperly() {
        assertEquals(logger.format("Test BasicErrorLogger format mensage"),
                String.format(
                        "%s[ ERROR at %s ] Test BasicErrorLogger format mensage%s",
                        foregroundColor,
                        logger.getTimestamp(),
                        ANSIColor.RESET));
    }

}
