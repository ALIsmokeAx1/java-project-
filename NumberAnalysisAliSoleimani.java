/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number.analysis.ali.soleimani;

/**
 *
 * @author Ax1
 */
public class NumberAnalysisAliSoleimani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        // TODO code application logic here
        int number =24;
        int orginalnumber=number;
        int orginalnumber1=number;
        int orginalnumber2=number;
        int orginalnumber3=number;
        int orginalnumber4=number;
        
        if(number==0)
            System.out.println("num is Zero!");
        else if(number>0){
            System.out.println("num is a postive!");
           
            
            int count=0;
            while(number>0){
                number=number/10;
                count++;
            }
            System.out.println("number have "+count+" Count!");
            int multipi=1;
            while(orginalnumber1>0){
                int number11=orginalnumber1%10;
                if(number11!=0){
                   
                    multipi=multipi*number11;
                    
                }
                
                orginalnumber1=orginalnumber1/10;
                
                
            }
            System.out.println(multipi);
            int sum=0;
            while(orginalnumber>0){
                int number1=orginalnumber %10;
                sum=sum+number1;
                orginalnumber=orginalnumber/10;
                    
            }
            System.out.println(sum);
           
            int max=0;
            int min=9;
            while(orginalnumber2>0){
                int digit=orginalnumber2%10;
                if(digit<min){
                    min =digit;
                }
                if(digit>max){
                    max=digit;
                }
                 orginalnumber2=orginalnumber2/10;
                
            }
             System.out.println("Max: "+max);
             System.out.println("min: "+ min);
             
             int evenCount=0;
             int oddCount=0;
             int digit1;
             while(orginalnumber3>0){
                 digit1=orginalnumber3%10;
                 if(digit1%2==0){
                     evenCount++;
                 }
                 else{
                     oddCount++;
                 }
                 
              orginalnumber3=orginalnumber3/10;   
             }
            System.out.println("Even Count: "+evenCount);
            System.out.println("odd Count: "+oddCount);
            int digit2;
            while(orginalnumber4>0){
                digit2=orginalnumber4%10;
              System.out.print(digit2);
               orginalnumber4=orginalnumber4/10;            
            }
            System.out.println();
        }
        else
            System.out.println("plz insert a postive number.");
        
        }
                 
        
    }
    

