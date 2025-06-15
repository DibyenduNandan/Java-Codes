package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Entity
public class Train{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long trainNumber;
	@NotBlank(message="Train Name should not be blank")
	@Pattern(regexp ="[A-Za-z//s]+", message = "Train name should consist of only letters")
	private String trainName;
	@NotBlank(message="This field should not be null")
	@Pattern(regexp ="[A-Za-z//s]+", message = "Train name should consist of only letters")
	private String sourceStation;
	@NotBlank(message="This field should not be null")
	private String destinationStation;
	private double price;
	
	@OneToOne(cascade = CascadeType.ALL )
	Route route;

	public long getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(long trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
	
	
	
	
}


