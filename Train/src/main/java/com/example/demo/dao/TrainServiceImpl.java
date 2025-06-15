package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.Train;
import com.example.demo.repository.TrainRepos;
import com.example.demo.service.TrainService;

@Component
public class TrainServiceImpl implements TrainService{

	@Autowired
	private TrainRepos repos;


	@Override
	public Train addTrain(Train trainObj) {
		// TODO Auto-generated method stub
		return repos.save(trainObj);
	}

	@Override
	public List<Train> getAllTrain() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	@Override
	public Train getTrainByNumber(long trainNumber) {
		// TODO Auto-generated method stub
		Optional<Train> opt= repos.findById(trainNumber);
		if(opt.isPresent()) {
			Train t=opt.get();
			return t;
		}
		else 
			return null;
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



}
