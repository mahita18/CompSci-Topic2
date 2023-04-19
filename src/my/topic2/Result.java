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
    String[] response = new String[3];
    String[] answer = new String[3];
    
    public Result(){
        score = 0;
        currentQ = 0;
        
        
    }
    
    public void markQuiz(String[] res, String[] ans){
        response = res;
        answer = ans;
        for (int z=0; z<3; z++){
            if(response[z].equals(answer[z]))
                isCorrect[currentQ]=true;
            else
                isCorrect[currentQ]=false;
            currentQ++;
        }
        
    }
    
    public double markTotal(){
        for(boolean item:isCorrect){
            if (item==true)
                score++;
        }
        return (score/12);
    }
}
