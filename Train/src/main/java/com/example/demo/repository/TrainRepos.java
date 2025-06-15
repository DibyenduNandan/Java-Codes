package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Train;

public interface TrainRepos extends JpaRepository<Train, Long> {
	
	@Query("select t from Train t where t.trainName=:p1")
	public Train getTrainByName(@Param("p1") String tname);
	
	@Query("select t from Train t where t.sourceStation=:p1 and t.destinationStation=:p2")
	public List<Train> searchTrain(@Param("p1") String source, @Param("p2") String destination);
}
