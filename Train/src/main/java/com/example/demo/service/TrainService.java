package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Train;

public interface TrainService {
	
	public Train addTrain(Train trainObj);
	public List<Train> getAllTrain();
	public Train getTrainByNumber(long trainNumber);
	public Train getTrainByName(String tname);
	public List<Train> searchTrain(String source,String destination);
	public Train updateTrain(long trainNumber,Train tobj);
	public int deleteTrain(long trainNumber);
	
}
