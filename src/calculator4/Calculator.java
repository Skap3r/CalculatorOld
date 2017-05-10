/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator4;

/**
 *
 * @author atifk
 */
public class Calculator {
    /**
     * This Class will perform the appropriate arithmetic operation.
     */
    
    public double calculate(String key, double a, double b) {
        double answer = 0;
        
        switch (key) {
            case "+": answer = add(a, b);
                    break;
            case "-": answer = sub(a, b);
                    break;
            case "*": answer = pro(a, b);
                    break;
            case "/": answer = div(a, b);
                    break;
        }
        
        return answer;
    }
    
    private double add(double a, double b) {
        return (a + b);
    }
    
    private double sub(double a, double b) {
        return (a - b);
    }
    
    private double pro(double a, double b) {
        return (a * b);
    }
    
    private double div(double a, double b) {
        return (a / b);
    }
    
    private double power(double number, double power) {
        return (Math.pow(number, power));
    }
}
