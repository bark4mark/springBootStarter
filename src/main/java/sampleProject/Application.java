package sampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
