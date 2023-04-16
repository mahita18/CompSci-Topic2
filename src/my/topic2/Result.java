/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.topic2;

/**
 *
 * @author mahit
 */
public class Result {
    
    boolean[ ] isCorrect = new boolean[12];	
    int score;
    
    public Result(){
        score = 0;
    }
    
    public void setResponse(int questNum){
        isCorrect[questNum] = true;
    }
    
    public double mark(){
        return (score/12);
    }
}
