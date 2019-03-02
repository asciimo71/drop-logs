package de.beanfactory.droplogs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Random;

@Component
@Slf4j
public class StashLogger {

    private static String[] words = new String[] {
            "One", "Two", "Three", "Four", "Five", "Six", "Seven"
    };

    private final Random random;
    private final ObjectMapper mapper;

    @Autowired
    public StashLogger() {
        this.random = new Random();
        this.mapper = new ObjectMapper();
    }

    @Scheduled(fixedDelay = 1000L)
    protected void dropLog() throws JsonProcessingException {
        MDC.put("SELECTED", anyWord());

        StructureObject so = StructureObject.builder()
                .aInt(5)
                .aString(anyWord())
                .aTimestamp(Timestamp.from(Instant.now()))
                .build();

        String jsonString = mapper.writeValueAsString(so);

        if(log.isInfoEnabled()) log.info("{} {} {} {} {} JSON: {}", anyWord(), anyWord(), anyWord(), anyWord(), anyWord(), jsonString );
    }

    private String anyWord() {
        return words[random.nextInt(words.length)];
    }

}
