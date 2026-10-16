/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studens.scores.analyz.ali.soleimani;
import java.util.Scanner;
/**
 *
 * @author Ax1
 */
public class StudensScoresAnalyzAliSoleimani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int lowest;
        int Highest;
        int passed=0;
        int excellent=0;
        System.out.println("plz insert a Count Students.");
        int students=input.nextInt();
        while(students<=0) {
            System.out.println("plz insert number student 0 higher.plz insert again!");
            students=input.nextInt();
        }
        for(int i=1;i<=students;i++)
        {
             System.out.println("plz insert a Scores Students.");
        int score=input.nextInt();
        while (score<0||score>20){
            System.out.println("plz insert score 0 to 20.");
        System.out.println("plz insert again!");
        score=input.nextInt();
        
        
        }
           if(score>10){
          passed++;
          }
           if (score>18){
               excellent++;
           }
           double percent=(double) (passed/students)*100;
           
        sum=sum+score;
        lowest=score;
        Highest=score;
        System.out.println("passed students: "+passed);
        System.out.println("excellentstudents: "+excellent);
        System.out.println("score Accepted: "+score);
        System.out.println("perecentage: "+percent+"%");
        if(score>Highest){
            score=Highest;
        }
        if(score<lowest){ 
            score=lowest;
        } 
        System.out.println("Highest Score: "+Highest);
        System.out.println("Lwest Score: "+lowest);
        }
        double avarage=(double)sum/students;
       
        
        System.out.println("avarage scores studdents :"+avarage);
       
        
        
        
        
        
            
            
            
          
       
        
        
 }
}
