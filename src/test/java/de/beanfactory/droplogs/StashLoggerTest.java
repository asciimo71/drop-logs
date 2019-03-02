package de.beanfactory.droplogs;

import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;

public class StashLoggerTest {

    @Test
    public void dropLog() {
        StashLogger logger = new StashLogger();

        logger.dropLog();
    }
}