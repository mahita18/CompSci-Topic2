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
    String[] response;
    String[] answer;
    
    public Result(){
        score = 0;
        currentQ = 0;
        
        
    }
    
    public void markQuiz(String[] res, String[] ans){
        response = res;
        answer = ans;
        int x = 0;
        for (String item:response){            
            if(item.equals(answer[x]))
                isCorrect[currentQ]=true;
            else
                isCorrect[currentQ]=false;
            currentQ++;
            x++;
        }
        
    }
    
    public String markTotal(){
        for(boolean item:isCorrect){
            if (item==true)
                score++;
        }
        return ("Your final score is " + score + "/11");
    }
}
