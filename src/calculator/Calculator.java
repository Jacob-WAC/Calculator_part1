package calculator;

public class Calculator implements java.io.Serializable {
private double opOne;
private double opTwo;
private String op;
private double results;
public Calculator() {
	
}
public double getOpOne() {
	return opOne;
}
public void setOpOne(double opOne) {
	this.opOne = opOne;
}
public double getOpTwo() {
	return opTwo;
}
public void setOpTwo(double opTwo) {
	this.opTwo = opTwo;
}
public String getOp() {
	return op;
}
public void setOp(String op) {
	this.op = op;
}


public double getResults() {
	return results;
}

public void performOperation() {
	if (this.getOp() == "+") {
	this.results = this.getOpOne() + this.getOpTwo();
	} else if (this.getOp() == "-") {
		this.results = this.getOpOne() - this.getOpTwo();
	}
}






}
