package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TrainServiceImpl;
import com.example.demo.model.Train;

@RestController
public class TrainController {
	
	@Autowired
	private TrainServiceImpl service;
	
	
	@PostMapping("/addTrain")
	public Train createTrain(@RequestBody Train trainObj) {
		System.out.println(trainObj.toString());
		return service.addTrain(trainObj);
	}
	
	@GetMapping("/view-train")
	public List<Train> viewallTrain(){
		return service.getAllTrain();
		
	}
	
	@GetMapping(path="/view-train-by-num/{tno}")
	public Train getTrainByNumber(@PathVariable("tno") long trainNumber) {
		return service.getTrainByNumber(trainNumber);
	}
	
	@PutMapping("/update-train/{tno}")
	public Train editTrain(@RequestBody Train tobj,@PathVariable long tno) {
		return service.updateTrain(tno, tobj);
	}
	
	
}
