package org.example.e14;
//**For you to do:**
//
//- Add the values of num1 and num2 and then subtract num3 from the result and store it in result1 variable
//- Multiply num4 and num5 together and then divide num6 from the result and store it in result2 variable
//- Print the following statement:
//  **_______ modded by _______ is ______**
//  result2           result1    blank3
//  where blank3 is the remainder of result1 into result2
//
//**Output:**
//
//```
//**_______ modded by _______ is ______**
//  result2           result1    blank3

public class E14AirthmeticOperations {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;
        int num3 = 3;

        int num4 = 7;
        int num5 = 10;
        int num6 = 5;


        //start coding here
        int result1=num1+num2-num3;
        int result2=num4*num5/num6;
        int blank1=result2 % result1;
        System.out.println(result2+" modded by "+result1+" is "+blank1);
        System.out.println(result2+" modded by "+result1+" is "+blank1);

    }
}



