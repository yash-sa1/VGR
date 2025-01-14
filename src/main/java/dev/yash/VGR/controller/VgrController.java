package dev.yash.VGR.controller;

import dev.yash.VGR.entity.VideoGame;
import dev.yash.VGR.service.Videogameservice;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/videogames")
public class VgrController {

    @Autowired
    private Videogameservice vgrService;

    @GetMapping
    public ResponseEntity<List<VideoGame>> getAllVideoGames() {
        return new ResponseEntity<List<VideoGame>>(vgrService.allVideoGames(), HttpStatus.OK);
    }

    @GetMapping("/{GameID}")
    public ResponseEntity<Optional<VideoGame>> getVideoGameById(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<VideoGame>>(vgrService.getVideoGameById(id), HttpStatus.OK);
    }
}