package de.beanfactory.droplogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DroplogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DroplogsApplication.class, args);
    }

}
