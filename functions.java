/*6) "Formal Parameters or Parameters":- The function defination in which the variables are passed as input.
     "Actual PArameters or Arguments":- The function call variables.

 7)What happens in memory is "stack", the function call is placed one by one in stack
 then poped one after other in stack,when returned in a function

 8) Call by Value:- The "copy" of the variables is passed to the function as formal parameters
    Call by Reference:- The "original" variables is passed to the function as formal parameters
 
 14)Function Overloading :-In a Class, having Same fun name but diff parameters
  It only depends on the type of parameters and no. of parameters
  BUT "not" on the return type of the function  
*/

import java.util.Scanner;

public class functions {
    //The functions inside class  are called "methods"
    //the functions outside the class are called "functions" itself
    public static void calculateSum(int a,int b){
   
     int sum=a+b;
     System.out.println("The sum is: "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculateSum(a,b);
    }
}
