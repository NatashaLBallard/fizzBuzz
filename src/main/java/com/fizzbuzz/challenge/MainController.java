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
        String multiples7 = "";
        String multiples17 = "";
        String multiples23 = "";
        int counter = 0;

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


            while (x <= endValue-1) {
                //System.out.println("<p>" + x + "</p>" );
                x++;

                if (Integer.valueOf(x) % 7 ==0){
                    counter ++;
                }


            }

        }




        System.out.println();
        System.out.println(String.valueOf(counter));
        return storedNum;


    }


}