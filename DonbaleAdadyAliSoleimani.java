/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donbale.adady.ali.soleimani;

/**
 *
 * @author Ax1
 */
public class DonbaleAdadyAliSoleimani {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numb=23;
        int numb1=numb;
        int max=numb;
        int count=0;
        int oddCount=0;
        int evenCount=1;
        for(;numb!=1;){
            
            if(numb%2==0){
           numb=numb/2;
           System.out.println(numb);
        }
        else if(numb%2==1){
            numb=numb*3+1;
            System.out.println(numb);
        }
             if(numb>max){
            max=numb;
        } 
             
             if(numb%2==0){
                 evenCount++;
                
             }
             if(numb%2==1){
                 oddCount++;
             }
            count++;
        
            
            
        }
       
        
        System.out.println("Count of chapter: "+count);
        System.out.println(" Max num is : "+max);
        System.out.println(" Even Count: "+evenCount);
        System.out.println("odd Count: "+oddCount);
        // TODO code application logic here
    }
    
}
