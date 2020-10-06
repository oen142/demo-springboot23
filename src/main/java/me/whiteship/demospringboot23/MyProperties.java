package me.whiteship.demospringboot23;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("my")
public class MyProperties {

    private String message;

    public MyProperties(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
