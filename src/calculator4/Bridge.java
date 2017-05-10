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
public class Bridge {
    private double firstNum, secondNum;
    private ArrayList keyInputs;
    private String tempText, sendText;
    
    private Bridge() {
        this.keyInputs = new ArrayList();
        this.tempText = "";
        this.sendText = "";
        this.firstNum = 0;
        this.secondNum = 0;
    }
    
    public static Bridge getInstance() {
        return BridgeHolder.INSTANCE;
    }
    
    private static class BridgeHolder {

        private static final Bridge INSTANCE = new Bridge();
    }
    
    private String displayText(String s, boolean concat) {
        ExtractNumber ext = new ExtractNumber();
        
        if (!concat) {
            this.sendText = ext.getData(this.keyInputs);
            this.keyInputs.clear();
            this.tempText = this.sendText;
        }
        else 
            this.sendText += s;
        
        return this.sendText;
    }
    
    public String inputText(String s) {
        if (s.equalsIgnoreCase("c")) {
            clear();
            return ("0");
        }
        
        if (this.keyInputs.isEmpty() && (checkIfKey(s) || s.equals("="))
                && this.tempText.equals(""))
            return ("0");
        
        if (!s.equals("=") && !checkIfKey(s)) {
            this.tempText += s;
            
            return (displayText(s, true));
        }
        else if (checkIfKey(s) || s.equals("=")) {
            if (!this.tempText.equals("")) {
                this.keyInputs.add(Double.parseDouble(this.tempText));
                this.tempText = "";
            }
            
            if (isLastInputKey(s))
                return (this.sendText);
            
            if (!s.equals("="))
                this.keyInputs.add(s);
            else
                return (displayText(s, false));

            return (displayText(s, true));
        }
        
        return ("Failed 64");
    }
    
    private boolean checkIfKey(String s) {
        return ("+".equals(s) || "-".equals(s) || "*".equals(s)
                || "/".equals(s) || "^".equals(s));
    }
    
    private void clear() {
        this.keyInputs.clear();
        this.tempText = "";
        this.sendText = "";
        this.firstNum = 0;
        this.secondNum = 0;
    }
    
    private boolean isLastInputKey(String s) {
        if (!this.keyInputs.isEmpty()) {
            int a = this.keyInputs.size() - 1;
            if (this.keyInputs.get(a).getClass().equals(String.class))
                return true;
        }
        
        return false;
    }
}
