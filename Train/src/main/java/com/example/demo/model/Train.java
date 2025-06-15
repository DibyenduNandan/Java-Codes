package com.example.demo.model;



import jakarta.persistence.*;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Train{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long trainNumber;
	private String trainName;
	private String sourceStation;
	private String destinationStation;
	private double price;
	
	@OneToOne(cascade = CascadeType.ALL )
	Route route;

}
