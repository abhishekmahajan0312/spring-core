package com.tc.springcoreassignment.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log

public class Dell implements Laptop {

	String brand;
	String color;
	float cost;
	String weight;
	String ram;
	String os;
	
	@Autowired
	@Qualifier("pd")
	StorageDevice storageDevice;
	
	public void display() {
		log.info("Displaying Dell Laptop");
	}

	public void process() {
		log.info("Processing Dell Laptop");
	}

	public void showSpecification() {
		log.info("Showing Dell Configuration");
		log.info("Brand:"+brand);
		log.info("Color:"+color);
		log.info("Cost:"+cost);
		log.info("Weight:"+weight);
		log.info("RAM:"+ram);
		log.info("OS:"+os);
		storageDevice.write();
		storageDevice.read();
		storageDevice.format();
	}

}
