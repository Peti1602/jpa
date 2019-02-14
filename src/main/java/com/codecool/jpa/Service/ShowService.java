package com.codecool.jpa.Service;

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
        return showRepository.findAll();
    }

}
