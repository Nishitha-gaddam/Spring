package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {

	public String getFortune() {

		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "heavy traffic this morning";

	}

	public String getFortune(Boolean tripwire) {
		if (tripwire) {
			throw new RuntimeException("Major Accident on Highway");
		}

		return getFortune();
	}

}
