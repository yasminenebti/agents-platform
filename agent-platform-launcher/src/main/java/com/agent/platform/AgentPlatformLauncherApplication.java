package com.agent.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgentPlatformLauncherApplication {
    public static void main(String[] args) {
        SpringApplication.run(AgentPlatformLauncherApplication.class, args);
        System.out.println("Agent Platform Launcher Application started successfully.");
    }

}
