package com.codecool.jpa.Service;

import com.codecool.jpa.Repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeasonService {

    @Autowired
    private SeasonRepository seasonRepository;


}
