package com.cars.caranddriver;

public class Driver extends Car {
	public int drive() {
		int gasLevel = this.getGasLevel();
		gasLevel -= 1;
		System.out.printf("Driving! Gas level is now: %d/10 \n", gasLevel);
		this.setGasLevel(gasLevel);
		this.isGameOver(gasLevel);
		return gasLevel;
	}
	public int useBoosters() {
		int gasLevel = this.getGasLevel();
		
		if (gasLevel >= 3) {
		gasLevel -= 3;
		System.out.printf("Boosters!  Gas level is now: %d/10 \n", gasLevel);
		this.setGasLevel(gasLevel);
		this.isGameOver(gasLevel);
		}
		else {
			System.out.printf("You do not have enough gas to boost: %d/10 \n", gasLevel);
		}
		return gasLevel;
	}
	public int reFuel() {
		int gasLevel = this.getGasLevel();
		if (gasLevel <= 8 ) {
		gasLevel += 2;
		System.out.printf("Refueling! Gas level is now: %d/10 \n", gasLevel);
		this.setGasLevel(gasLevel);
		this.isGameOver(gasLevel);
		}
		else {
			System.out.printf("You have too much gas to refuel! Gas level is: %d/10 \n", gasLevel);
		}
		return gasLevel;
	}
	
}
