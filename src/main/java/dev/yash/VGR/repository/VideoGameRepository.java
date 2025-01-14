package dev.yash.VGR.repository;

import dev.yash.VGR.entity.VideoGame;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VideoGameRepository extends MongoRepository<VideoGame, ObjectId> {

    Optional<VideoGame> findVideoGameByGameID(String gameID);

}
