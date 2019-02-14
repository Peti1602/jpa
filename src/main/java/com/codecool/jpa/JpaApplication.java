package com.codecool.jpa;

import com.codecool.jpa.Model.Category;
import com.codecool.jpa.Model.Season;
import com.codecool.jpa.Model.Show;
import com.codecool.jpa.Repository.SeasonRepository;
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

    @Autowired
    private SeasonRepository seasonRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(){
        return args ->{
            Show show1 = new Show("Game of Thrones", Category.Fantasy, "Seven noble families fight for control of the mythical land of Westeros.");
            showRepository.save(show1);
            Season season1 = new Season("Season 1", "Trouble is brewing in the Seven Kingdoms of Westeros.", show1);
            seasonRepository.save(season1);
            Season season2 = new Season("Season 2", "The cold winds of winter are rising in Westeros...", show1);
            seasonRepository.save(season2);
            Season season3 = new Season("Season 3", "Duplicity and treachery...nobility and honor...", show1);
            seasonRepository.save(season3);
            Season season4 = new Season("Season 4", "The War of the Five Kings is drawing to a close...", show1);
            seasonRepository.save(season4);
            Season season5 = new Season("Season 5", "The War of the Five Kings, once thought to be drawing...", show1);
            seasonRepository.save(season5);
            Season season6 = new Season("Season 6", "Following the shocking developments at the conclusion...", show1);
            seasonRepository.save(season6);
            Season season7 = new Season("Season 7", "Daenerys arrives in Westeros, and takes up the ancestral seat of House Targaryen...", show1);
            seasonRepository.save(season7);
        };
    }

}

