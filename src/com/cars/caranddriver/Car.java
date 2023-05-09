package com.cars.caranddriver;

public class Car {
	private int gas = 10;
	public int getGasLevel() {
		return gas;
	}
	public void setGasLevel(int gas) {
		this.gas = gas;
	}
	public boolean isGameOver(int gas) {
		this.gas = gas;
		if (this.gas == 0) {
			System.out.println("You have no gas remaining!  GAME OVER!!!");
			return true;
		}
		else {
			return false;
		}
	}
	
}
