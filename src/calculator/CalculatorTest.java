package calculator;

public class CalculatorTest {
public static void main(String[] args) {
	Calculator calculator = new Calculator();
	
	calculator.setOpOne(10.5);
	calculator.setOpTwo(5.2);
	calculator.setOp("+");
	calculator.performOperation();
	System.out.println(calculator.getResults()); 
}
}
