package org.fcx.familytree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序入口
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args ) {
    	System.setProperty("spring.profiles.active", "dev");
        SpringApplication.run(App.class, args);
    }
}
