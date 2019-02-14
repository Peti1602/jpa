package com.codecool.jpa;

import com.codecool.jpa.Model.Category;
import com.codecool.jpa.Model.Show;
import com.codecool.jpa.Repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

    @Autowired
    private ShowRepository showRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(){
        return args ->{
            Show show1 = new Show("Game of Thrones", Category.Fantasy, "Seven noble families fight for control of the mythical land of Westeros.");
            showRepository.save(show1);
        };
    }

}

