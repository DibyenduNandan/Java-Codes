package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.exception.InvalidTrainException;
import com.example.demo.exception.TrainCreationException;
import com.example.demo.model.Route;
import com.example.demo.model.Train;
import com.example.demo.repository.TrainRepos;
import com.example.demo.service.TrainService;

@Component
public class TrainServiceImpl implements TrainService{

	@Autowired
	private TrainRepos repos;
	
	


	@Override
	public Train addTrain(Train trainObj)throws  TrainCreationException{
		// TODO Auto-generated method stub
		if(repos.existsById(trainObj.getTrainNumber())) {
			throw new TrainCreationException("Train Already exixting");
		}
		
		return repos.save(trainObj);
	}

	@Override
	public List<Train> getAllTrain() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	@Override
	public Train getTrainByNumber(long trainNumber) throws InvalidTrainException {
		// TODO Auto-generated method stub
		Optional<Train> opt= repos.findById(trainNumber);
		if(opt.isPresent()) {
			Train t=opt.get();
			return t;
		}
		throw new InvalidTrainException("Invalid Train Number");
	}

	@Override
	public Train getTrainByName(String tname) {
		// TODO Auto-generated method stub
		return repos.getTrainByName(tname);
	}

	@Override
	public List<Train> searchTrain(String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Train updateTrain(long trainNumber, Train tobj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteTrain(long trainNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

//	fetch train route and station by trainName
	@Override
	public List<Route> getTrainRouteByName(String tname) {
		// TODO Auto-generated method stub
		return repos.getTrainRouteByName(tname);
	}
	
	
//	fetch train price and trainName by route name
	public List<Object[]> getByNameroute(String name){
		return repos.getByNameroute(name);
	}
	
	
	public int createlistTrain(List<Train> train) {
		int count=0;
		for(Train t:train) {
			if(repos.save(t)!=null)
				count+=1;
		}
		return count;
	}


}
