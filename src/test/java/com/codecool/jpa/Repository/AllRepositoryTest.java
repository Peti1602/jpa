package com.codecool.jpa.Repository;

import com.codecool.jpa.Model.Category;
import com.codecool.jpa.Model.Season;
import com.codecool.jpa.Model.Show;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
public class AllRepositoryTest {

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private SeasonRepository seasonRepository;

    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void saveOneShow(){
        List<String> actors = new ArrayList<>();
        actors.add("Test Actor");
        Show newShow = new Show("TestTitle", Category.Drama, "TestOverview", actors);
        showRepository.save(newShow);

        List<Show> shows = showRepository.findAll();
        assertThat(shows).hasSize(1);
    }

    @Test
    public void findShowById(){
        List<String> actors = new ArrayList<>();
        actors.add("Test Actor");
        Show newShow = new Show("TestTitle", Category.Drama, "TestOverview", actors);
        showRepository.save(newShow);
        assertEquals(showRepository.findFirstById(3).getId(), 3);
    }

    @Test
    public void findSeasonById(){
        List<String> actors = new ArrayList<>();
        actors.add("Test Actor");
        Show newShow = new Show("TestTitle", Category.Drama, "TestOverview", actors);
        showRepository.save(newShow);

        Season newSeason = new Season("TestTitle", "TestOverview", newShow);
        seasonRepository.save(newSeason);

        Season testSeason  = seasonRepository.findFirstById(1);
        assertEquals(testSeason.getId(), 1);
    }

}