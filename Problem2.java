/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse490.coding.assignment;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Problem2 {

   /* problem name :
    A super increasing Knapsack is given and with the value of m and n.
    A plain text will be given too. Encrypt the message 
    and show that after decryption you get the same plain text.
    */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int S=0;
        int sum_Encrypt=0;
        int sum_Decrypt=0;
        int private_key_mod_value_for_decrypt=0;
        System.out.println("Please enter the length of Super increasing Knacpsack");
        int length_Knapsack = sc.nextInt();
        int SIK[]=new int[length_Knapsack];//private key
        System.out.println("Please enter the value of Super increasing Knacpsack");
        for(int i=0;i<length_Knapsack;i++)
        {
            
            SIK[i]=sc.nextInt();
        }
        System.out.println("Please enter the value m");
        int m=sc.nextInt();
        System.out.println("Please enter the value n");
        int n=sc.nextInt();
        
        int Gk[]=new int[length_Knapsack]; // public key
        for(int j=0;j<length_Knapsack;j++)
        {
           Gk[j]=(SIK[j]*m ) % n;
        }
        
        System.out.println("Please enter the message which needs to encrypt");
        sc.nextLine();
        String s=sc.nextLine();
       
        for(int l=0;l<s.length();l++)
        {
            if(s.charAt(l)=='1')
            {
              sum_Encrypt+=Gk[l];  
            }
        }
        for(int k=0;k<n;k++)
        {
            int f=(m*k)%n;
            if(f==1)
            {
                private_key_mod_value_for_decrypt=k;
            }
        }        
        S = (sum_Encrypt*private_key_mod_value_for_decrypt) % n;
        String arr[]=new String[length_Knapsack];
        for(int p=length_Knapsack-1;p>=0;p--)
        {
          if(SIK[p]>S)
          {
             arr[p]="0"; 
          }
          else
          {
              S=S-SIK[p];
              arr[p]="1";
              
          }
        }
        System.out.println("Encrypt message : "+s);
        System.out.print("Decrypt message : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
}
