package com.week1.day5.assignment1.MethodsAndFlow;

public class MethodsAndFlow {

	String[] stringArray;
	Integer startPosition;
	Integer numberOfValuesToOutput;

	@SuppressWarnings("unused") MethodsAndFlow() {
	}

	public MethodsAndFlow(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public MethodsAndFlow(String[] stringArray, Integer startPosition, Integer numberOfValuesToOutput) {
		this.stringArray = stringArray;
		this.startPosition = startPosition;
		this.numberOfValuesToOutput = numberOfValuesToOutput;
	}

	public void outputSubset(int startPosition, int numberOfValues) {
		int temp = Math.min(startPosition, numberOfValues);
		if (temp <= startPosition)
			for (int i = startPosition; i < temp; i++) {
				System.out.println(stringArray[i]);
			}
		else if (temp >= startPosition)
			for (int i = temp; i > startPosition; i--) {
				System.out.println(stringArray[i]);
			}
		else if (numberOfValues > stringArray.length) {
			String s = "Index out of bounds";
			throw new IndexOutOfBoundsException(s);
		}

	}

	public void outputAll() {
		outputSubset(0, stringArray.length);
	}

	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public Integer getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(Integer startPosition) {
		this.startPosition = startPosition;
	}

	public Integer getNumberOfValuesToOutput() {
		return numberOfValuesToOutput;
	}

	public void setNumberOfValuesToOutput(Integer numberOfValuesToOutput) {
		this.numberOfValuesToOutput = numberOfValuesToOutput;
	}

}
