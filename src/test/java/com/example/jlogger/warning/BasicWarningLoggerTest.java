package com.example.jlogger.warning;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.jlogger.util.ANSIColor;

public class BasicWarningLoggerTest {

    String tag = "WARNING";
    String mensage = "Test format mensage";
    String foregroundColor = ANSIColor.YELLOW;

    private final BasicWarningLogger logger = new BasicWarningLogger();

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
