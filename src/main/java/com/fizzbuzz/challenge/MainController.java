package com.fizzbuzz.challenge;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {


    @RequestMapping("/")
    public String fizzbuzz()
    {


        int x = 0;
        String storedNum = "";
        String multiples17 = "";
        String multiples23 = "";
        int counter = 0;
        counter++;

        double endValue = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter desired end value for the loop: ");
        endValue = keyboard.nextDouble();

        while (x <= endValue-1) {
            //System.out.println("<p>" + x + "</p>" );
            x++;

            System.out.println(storedNum);

            if ((Integer.valueOf(x) % 3 ==0) && (Integer.valueOf(x) % 5 ==0)){
                storedNum += "FizzBuzz" + "<br/>";
            }

            else if (Integer.valueOf(x) % 3 ==0){
                storedNum += "Fizz" + "<br/>";
            }

            else if (Integer.valueOf(x) % 5 ==0){
                storedNum += "Buzz" + "<br/>";
            }

            else if ((Integer.valueOf(x) % 3 !=0) && (Integer.valueOf(x) % 5 !=0)){
                storedNum += x + "<br/>";
            }

        }



        System.out.println();
        return storedNum ;
    }


    public String multipleTally()
    {

        int x = 0;
        int multiples7 = 0;
        int counter = 0;
        counter++;
        double endValue = 0;

        while (x <= endValue-1) {
            //System.out.println("<p>" + x + "</p>" );
            x++;

            if (Integer.valueOf(x) % 7 ==0){
                multiples7++;
            }


        }

        System.out.println();
        return (String.valueOf(multiples7)) ;


    }
}