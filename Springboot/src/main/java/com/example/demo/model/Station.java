package com.example.demo.model;



import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Station {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stationId")
	private int id;
	private String name;
	@JsonBackReference
	@ManyToOne
	Route route;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	
	
	
	
	
}
