/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator4;

import java.util.ArrayList;

/**
 *
 * @author atifk
 */
public class ExtractNumber {
    private ArrayList data;
    private String key;
    private double firstNumber, secondNumber, answer;
    private int index;
    
    public ExtractNumber() {
        this.data = new ArrayList();
        this.key = "";
        this.firstNumber = 0;
        this.secondNumber = 0;
        this.index = 0;
        this.answer = 0;
    }
    
    public String getData(ArrayList data) {
        this.data = data;
        Calculator calc = new Calculator();
        
        if (this.data.indexOf("/") != -1)
            operation("/");
        
        if (this.data.indexOf("*") != -1)
            operation("*");
        
        while (this.data.size() != 1) {
            this.firstNumber = (double)this.data.get(0);
            this.secondNumber = (double)this.data.get(2);
            this.key = (String)this.data.get(1);

            this.answer = calc.calculate(this.key, this.firstNumber,
                    this.secondNumber);

            deleteEquation(1);
            
            this.data.add(0, this.answer);
        }
        
        if (this.data.size() == 1) {
            return finalAnswer();
        }
        
        return "failed";
    }
    
    private void operation(String s) {
        Calculator calc = new Calculator();
        
        while (this.data.size() != 1 && this.data.indexOf(s) != -1) {
            if (this.data.indexOf(s) != -1) {
                this.index = this.data.indexOf(s);
                
                this.key = s;
                this.firstNumber = (double)this.data.get(index - 1);
                this.secondNumber = (double)this.data.get(index + 1);
                
                this.answer = calc.calculate(this.key, this.firstNumber, 
                        this.secondNumber);
                
                deleteEquation(this.index);
                
                this.data.add(index - 1, this.answer);
            }
        }
    }
    
    private void deleteEquation(int i) {
        for (int j = 0; j < 3; j++)
            this.data.remove(i-1);
    }
    
    private String finalAnswer() {
        double tempD;
        long tempL;
        
        tempD = (double)this.data.get(0);
        tempL = Math.round(tempD);
        
        if (tempD % tempL == 0)
            return (Long.toString(tempL));
        
        return (Double.toString(tempD));
    }
}
