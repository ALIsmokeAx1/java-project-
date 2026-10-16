/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm.ali.soleimani;
import java.util.Scanner;
/**
 
 * @author Ax1
 */
public class ATMAliSoleimani {
           
    


            

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        int inventory=10000000;
        
    int Choose=0;
    int withdraw;
    int amount;
    while(Choose!=4){
        System.out.println("---ATM MENU---");
        System.out.println("1_ Check amount");
        System.out.println("2_ Deposit");
        System.out.println("3_Withdraw");
        System.out.println("4_ Exit");
        System.out.println("Chosse optoins");
        Choose=input.nextInt();
    
    switch( Choose){
     case 1:
            System.out.println("Balance: "+inventory);
        break;
        case 2:
            System.out.println("Enter Deposit!");
            amount=input.nextInt();{
            if(amount>0){
                inventory=inventory+amount;
                System.out.println("Deposite Successful!");
            }}
        break;
        case 3:
            System.out.println("Wihtdraw (only multipie 250000!) ");
            withdraw=input.nextInt();
            if(withdraw<=inventory && withdraw>0&& withdraw%50000==0){
                inventory=inventory-withdraw;
                System.out.println("Withdrawl Succesful!");
            }
            
        break;
        case 4:
            System.out.println("Exit Adm!");
            break;
        default:
            System.out.println("plz insert a 1 to 4");
         }
        
        // TODO code application logic here
    } }
    
  } 



