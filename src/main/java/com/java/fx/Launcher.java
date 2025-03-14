package com.java.fx;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;

public class Launcher {
    public static void main(String[] args) {
        Application.launch(Main.class, args);
        SpringApplication.run(Main.class, args);

    }
}
