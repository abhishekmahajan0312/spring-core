package com.tc.springcoreassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tc.springcoreassignment.interfaces.HP;
import com.tc.springcoreassignment.interfaces.HardDisk;
import com.tc.springcoreassignment.interfaces.Laptop;
import com.tc.springcoreassignment.interfaces.PenDrive;
import com.tc.springcoreassignment.interfaces.StorageDevice;

@Configuration
@ComponentScan("com.tc.springcoreassignment")
public class StorageDeviceConfig {
	
	@Bean(name="hd")
	public StorageDevice hardDisk() {
		HardDisk hd = new HardDisk();
		hd.setCapacity("500GB");
		hd.setReadingSpeed("4GB/s");
		hd.setWritingSpeed("2GB/s");
		return hd;
	}
	
	@Bean(name="pd")
	public StorageDevice penDrive() {
		PenDrive pd = new PenDrive();
		pd.setCapacity("5GB");
		pd.setReadingSpeed("4MB/s");
		pd.setWritingSpeed("2MB/s");
		return pd;
	}
	
}
