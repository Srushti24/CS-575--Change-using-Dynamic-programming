
import java.lang.Math;
import java.util.Scanner;
public class change {

   
    public static void main(String[] args) {
        System.out.println("Enter the number of cents");
/*Enter the amount who's change is needed*/
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
       
       
            int quaters=0;
            int dimes=0;
            int nickels=0;
            int pennies=0;
/*Initializing all our denominations to zero*/
            while(a>0)
/*Making sure that exchange can take place only when the amount is greater than 0*/
            {
        if(a>=25)
/*If the amount is greater than 25*/
        {
             quaters=a/25;
/*The number of quaters that can be used*/
             a=a-(quaters*25);
/*the amount remaining after subtracting the number of quaters used to make changes*/
              System.out.println("The number of quaters used:"+quaters);
 /*Printing the number of quaters*/            
             
            
        }
        else if(a>=10 && a<25)
/*if the amount is less than 25 and greater than or equal to 10 we can use dimes*/
        {
            dimes= a/10;
/*Number of dimes which can be used to make change*/
            a=a-(dimes*10);
/*the amount remaining after the number of dimes used to make change*/
            System.out.println("The number of dimes used are:"+dimes);
/*Printing the number of dimes*/
           
           
        }
        else if(a>=5 && a<10)
/*if the amount is less than 10 but greater than 5 or equal to 5*/
        {
            nickels=a/5;
/*Number of nickels that can be used*/
            a=a-(nickels*5);
/*The amount remaining after the number of nickels used to make change*/
            System.out.println("The number of nickels are:"+nickels);
/*Printing the number of nickels used*/
            
        }
        else if(a<=4)
/*If the amount is less than or equal to 4 cents*/
        {
            pennies=a;
/*The number of pennies that can be used*/
            System.out.println("The number of pennies used are"+pennies);
/*Printing the number of pennies used*/
            break ;
            
        }
            }
        int coins=quaters+dimes+nickels+pennies;
        System.out.println("The total number of coins used are:" +coins );
/*The total number of coins used*/
        
        
    System.out.println("Enter the number of cents:");
    int n=sc.nextInt();
/* enter the number of cents who's change you want to make in 2nd part of the program*/
    

System.out.println("Enter the value of c");
int c=sc.nextInt();
System.out.println("Enter the value of k");
int k=sc.nextInt();
int i=0;
int g=0;
int total=0;

 
   while(n>0)
   {
/*Making sure the activity happens only when amount is greater than 0*/
   for( i=k;i>=0;i--)
   {
       for( int j=0;j<k;j++)
       {
           int denomination= (int)(Math.pow(c,i));
/*calculating the denominations*/
   int f=n/(denomination);
/*dividing the denominations one by one with the largest denomination divided first to get least number of coins*/
    n=n-(f*denomination);
/* updating the amount values*/
   
   System.out.println("The total number of coins of  " + denomination + "used are " + f);
/*printing the denominations used*/
   break;
       }
 
    }
}
}
}

        
        
    
    
        
    
    

