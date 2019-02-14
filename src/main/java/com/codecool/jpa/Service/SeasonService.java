package com.codecool.jpa.Service;

import com.codecool.jpa.Model.Episode;
import com.codecool.jpa.Repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonService {

    @Autowired
    private SeasonRepository seasonRepository;

    public List<Episode> getAllEpisodesOfSeason(int id){
        return seasonRepository.findFirstById(id).getEpisodes();
    }

}
