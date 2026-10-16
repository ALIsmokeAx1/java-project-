/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random.numb.ali.soleimani;
import java.util.Scanner;


  
public class RandomNumbAliSoleimani {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int target=37;
       int gusses=0;
       int count=0;
       int score =100;
       boolean gussed=false;
       Scanner input=new Scanner(System.in);
       while(target!=gusses && count<=7){
           System.out.println("gusse the number 1 to 100");
           gusses=input.nextInt();
           if(gusses<1||gusses>100){
               System.out.println("invalid number! plz insert 1 to 100.");
           }
           if(gusses>target){
               System.out.println("Too High!");
               count++;
               score=score-10;
               System.out.println("Your score: "+score);
           }
           else if(gusses<target){
               System.out.println("Too Low!");
              count++;
              score=score-10;
               System.out.println("Your score: "+score);
           }
           else{
               System.out.println("Correct!");
           System.out.println("Score :"+score);
           }
           gussed=true;
           if(gussed){
               System.out.println(" Try:"+count);
                System.out.println("Score :"+score);
               
           }
       }
    }
    
}
