package com.codecool.jpa.Service;

import com.codecool.jpa.Model.Season;
import com.codecool.jpa.Model.Show;
import com.codecool.jpa.Repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    public List<Show> getAllShows(){
        List<Show> shows = showRepository.findAll();
        for(Show show : shows){
            show.setNumberOfSeasons(show.getSeasons().size());
        }
        return shows;
    }

    public List<Season> getAllSeasonOfShowById(int id){
        return showRepository.findFirstById(id).getSeasons();
    }

}
