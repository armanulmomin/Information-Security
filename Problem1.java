/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse490.coding.assignment;
import java.util.*;
/*
Problem name :
Suppose, the value of three registers X, Y, Z are given 
along with the number of key bits. You need to generate the key accordingly.
*/
public class Problem1 {
    public static void main(String[]args)
    {
        
        Scanner sc=new Scanner(System.in);
        int major=0;
        int X[]=new int[19];
        int Y[]=new int[22];
        int Z[]=new int[23];
        System.out.println("Please enter the value of Key");
        int key=sc.nextInt();
        System.out.println("Please enter the value of X : ");
        for(int i=0;i<19;i++)
        {
           
            X[i]=sc.nextInt();
        }
        System.out.println("Please enter the value of Y : ");
        for(int i=0;i<22;i++)
        {
             
            Y[i]=sc.nextInt();
        }
        System.out.println("Please enter the value of Z : ");
        for(int i=0;i<23;i++)
        {
             
            Z[i]=sc.nextInt();
        }
        for(int l=0;l<key;l++)
        {
            if((X[8]==1 && Y[10]==1 && Z[10]==1) || (X[8]==1 && Y[10]==1) || (Y[10]==1 && Z[10]==1)|| (X[8]==1 || Z[10]==1) )
        {
            major = 1;
        }
        int x = X[13] ^ X[16] ^ X[17] ^ X[18];
        int y = Y[20] ^ Y [21];
        int z = Z[22] ^ Z[21] ^ Z[20] ^ Z[7];
        if(x != major)
        {
            for(int i=18;i>0;i--)
            {
                X[i]=X[i-1];
            }
            X[0]=major;
        }
        if(y != major)
        {
            for(int i=21;i>0;i--)
            {
                Y[i]=Y[i-1];
            }
            Y[0]=major;
        }
        if(z != major)
        {
            for(int i=22;i>0;i--)
            {
                Z[i]=Z[i-1];
            }
            Z[0]=major;
        }
        int answer=X[18] ^ Y[21] ^ Z[22];
        System.out.print(answer);
        }
        
        
    }
}
