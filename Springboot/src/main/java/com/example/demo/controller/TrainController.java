package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TrainServiceImpl;
import com.example.demo.exception.InvalidTrainException;
import com.example.demo.exception.TrainCreationException;
import com.example.demo.model.Route;
import com.example.demo.model.Train;

@RestController
public class TrainController {
	
	@Autowired
	private TrainServiceImpl service;
	
	
	@PostMapping("/addTrain")
	public Train createTrain(@Valid @RequestBody Train trainObj) throws TrainCreationException {
		System.out.println(trainObj.toString());
		return service.addTrain(trainObj);
	}
	
	@PostMapping("/Trains")
	public int createListOfTrain(@RequestBody List<Train> trainObj) {
		return service.createlistTrain(trainObj);
	}
	
	
	
	@GetMapping("/view-train")
	public List<Train> viewallTrain(){
		return service.getAllTrain();
		
	}
	
	@GetMapping("/by-num/{tno}")
	public Train getTrainByNumber(@PathVariable("tno") long trainNumber) throws InvalidTrainException {
		return service.getTrainByNumber(trainNumber);
	}
	
	@PutMapping("/update-train/{tno}")
	public Train editTrain(@RequestBody Train tobj,@PathVariable long tno) {
		return service.updateTrain(tno, tobj);
	}
	
	@GetMapping("/getRoute/{tname}")
	public List<Route> getRouteByTrainName(@PathVariable("tname") String tnam ) {
		return service.getTrainRouteByName(tnam);
	}
	
	@GetMapping("/getRouteName/{name}")
	public List<Object[]> getTrainName(@PathVariable("name") String tnam ) {
		return service.getByNameroute(tnam);
	}
	
	
}
