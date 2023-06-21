package abi_practice;


public class GCD{
public static void main(String args[]){
    //Enter two number whose GCD needs to be calculated. 
    try{
        int number1=20;
        int number2=11;
      System.out.println("GCD of two numbers " + number1 +" and " + number2 +" is :" + findGCD(number1,number2)); 
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
       /* * Java method to find GCD of two number using Euclid's method * @return GDC of two numbers in Java */ 
       private static int findGCD(int number1, int number2) 
       { 
           //base case 
           if(number2 == 0)
           { 
               return number1;
            } 
         return findGCD(number2, number1%number2);
         } 
        }

