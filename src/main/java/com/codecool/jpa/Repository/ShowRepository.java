package com.codecool.jpa.Repository;

import com.codecool.jpa.Model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Integer> {

    List<Show> findAll();

}
