package com.codecool.jpa;

import com.codecool.jpa.Model.Category;
import com.codecool.jpa.Model.Episode;
import com.codecool.jpa.Model.Season;
import com.codecool.jpa.Model.Show;
import com.codecool.jpa.Repository.EpisodeRepository;
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

    @Autowired
    private EpisodeRepository episodeRepository;

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
            Episode episode1 = new Episode("Winter Is Coming", "The episode centers on the Stark family, and how its lord, Eddard Stark...", season1);
            episodeRepository.save(episode1);
            Episode episode2 = new Episode("The Kingsroad", "Nearly all the action of the episode happens during travel: Eddard Stark and his daughters...", season1);
            episodeRepository.save(episode2);
            Episode episode3 = new Episode("Lord Snow", "The plot follows Jon Snow's training at The Wall; Eddard's arrival at King's Landing...", season1);
            episodeRepository.save(episode3);
            Episode episode4 = new Episode("Cripples, Bastards, and Broken Things", "In this episode Lord Eddard Stark, the new Hand of the King...", season1);
            episodeRepository.save(episode4);
            Episode episode5 = new Episode("he Wolf and the Lion", "In the city of King's Landing, the Tourney of the Hand comes to an end while...", season1);
            episodeRepository.save(episode5);
            Episode episode6 = new Episode("A Golden Crown", "The episode's plot depicts the deterioration of the political balance of the seven kingdoms.", season1);
            episodeRepository.save(episode6);
            Episode episode7 = new Episode("You Win or You Die", "Eddard Stark revealing what he has discovered to Cersei Lannister while King Robert is still away on a hunt.", season1);
            episodeRepository.save(episode7);
            Episode episode8 = new Episode("The Pointy End", "While the Lannisters seek to capture his daughters, his son and heir, Robb, raises an army in the North.", season1);
            episodeRepository.save(episode8);
            Episode episode9 = new Episode("Baelor", "The plot depicts Eddard Stark, imprisoned and accused of high treason...", season1);
            episodeRepository.save(episode9);
            Episode episode10 = new Episode("Fire and Blood", "The title of the episode is the motto of House Targaryen, and alludes to the aftermath of the previous episode's climactic events.", season1);
            episodeRepository.save(episode10);
        };
    }

}

