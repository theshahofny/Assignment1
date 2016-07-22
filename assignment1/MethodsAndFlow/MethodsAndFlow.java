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
		int temp = Math.min(startPosition + numberOfValues, stringArray.length);
		
		if(((temp > 0) && (temp == stringArray.length))){	
			for (int i = 0; i < stringArray.length; i++) 
			{
				System.out.println(stringArray[i]);
			}
		}
		else if(temp > 0){	
			for (int i = 0; i < stringArray.length; i++) 
			{
				System.out.println(stringArray[i]);
			}
		}
		else if (numberOfValues > stringArray.length) {
			String s = "Index out of bounds";
			throw new IndexOutOfBoundsException(s);
		}
		else if (startPosition < 0) {
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
