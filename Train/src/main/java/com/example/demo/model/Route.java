package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String Name;
	
	@OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="rote_map", joinColumns = @JoinColumn(name="Id"),inverseJoinColumns = 
//	@JoinColumn(name="stationId"))
	List <Station> station;
}
