package dev.yash.VGR.service;

import dev.yash.VGR.entity.VideoGame;
import dev.yash.VGR.repository.VideoGameRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Videogameservice {

    @Autowired
    private VideoGameRepository videoGameRepository;

    public List<VideoGame> allVideoGames() {
        return videoGameRepository.findAll();
    }


    public Optional<VideoGame> getVideoGameById(ObjectId id) {
        return videoGameRepository.findById(id);
    }
}