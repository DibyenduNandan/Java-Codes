package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.*;
import com.example.demo.model.Route;
import com.example.demo.model.Train;

public interface TrainService {
	
	public Train addTrain(Train trainObj)throws TrainCreationException;
	public List<Train> getAllTrain();
	public Train getTrainByNumber(long trainNumber) throws InvalidTrainException;
	public Train getTrainByName(String tname)throws InvalidTrainName;
	public List<Train> searchTrain(String source,String destination)
	throws InvalidSourceAndDestination;
	public Train updateTrain(long trainNumber,Train tobj);
	public int deleteTrain(long trainNumber);
	public List<Route> getTrainRouteByName(String tname);
	public List<Object[]> getByNameroute(String name);
	
	
}
