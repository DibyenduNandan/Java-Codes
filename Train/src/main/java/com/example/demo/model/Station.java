package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Station {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stationId")
	private int Id;
	private String name;
	@ManyToOne
	Route route;
	
	
	
	
}
