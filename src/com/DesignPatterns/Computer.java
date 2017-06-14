package com.DesignPatterns;

public class Computer {

	private String HDD;
	private String RAM;

	//optional parameter
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String RAM) {
		this.RAM = RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public void setGraphicsCardEnabled(boolean graphicsCardEnabled) {
		isGraphicsCardEnabled = graphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public void setBluetoothEnabled(boolean bluetoothEnabled) {
		isBluetoothEnabled = bluetoothEnabled;
	}

	public String getHDD() {
		return HDD;
	}

	public void setHDD(String HDD) {
		this.HDD = HDD;
	}


	public Computer(ComputerBuilder builder){
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;

	}

	public static class ComputerBuilder{
		private String HDD;
		private String RAM;

		//optional parameter
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		ComputerBuilder(String HDD, String RAM){
			this.HDD = HDD;
			this.RAM = RAM;
		}

		ComputerBuilder setComputerBuilderHDD(boolean isGraphicsCardEnabled){
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		ComputerBuilder setComputerBuilderRAM(boolean isGraphicsCardEnabled){
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		Computer build(){

			return new Computer(this);
		}
	}
}

class TestBuilderPattern {
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").setComputerBuilderHDD(true).build();
		System.out.println(computer.getHDD());
		System.out.println(computer.getRAM());
		System.out.println(computer.isBluetoothEnabled());
		System.out.println(computer.isGraphicsCardEnabled());
	}
}
