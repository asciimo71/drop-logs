package de.beanfactory.droplogs;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

public class StashLoggerTest {

    @Test
    public void dropLog() throws JsonProcessingException {
        StashLogger logger = new StashLogger();

        logger.dropLog();
    }
}