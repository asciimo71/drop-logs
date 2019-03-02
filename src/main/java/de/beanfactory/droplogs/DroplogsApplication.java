package de.beanfactory.droplogs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DroplogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DroplogsApplication.class, args);
    }

}
