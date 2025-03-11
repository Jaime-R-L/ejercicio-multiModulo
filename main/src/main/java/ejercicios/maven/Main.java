package ejercicios.maven;

import calculator.CalculatorService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalculatorService calc = new CalculatorService();
        calc.runCalculator();
    }
}