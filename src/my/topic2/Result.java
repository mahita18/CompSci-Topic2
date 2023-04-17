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
    int currentQ;
    
    public Result(){
        score = 0;
        currentQ = 0;
    }
    
    public void markQuiz(String[] response, String Q1Ans, String Q2Ans, Boolean Q3Ans){
        for (int z=0; z<3; z++){
            if(response[z].equals(Q1Ans))
                isCorrect[currentQ]=true;
            else
                isCorrect[currentQ]=false;
        }
    }
    
    public void setResponse(int questNum){
        isCorrect[questNum] = true;
    }
    
    public double markTotal(){
        return (score/12);
    }
}
