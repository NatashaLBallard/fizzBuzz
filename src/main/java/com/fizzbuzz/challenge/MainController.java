package com.fizzbuzz.challenge;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {


    @RequestMapping("/")
    public String fizzbuzz() {


        int x = 0;
        String storedNum = "";
        String multiples7 = "";
        String multiples17 = "";
        String multiples23 = "";
        int counter7 = 0;
        int counter17 = 0;
        int counter23 = 0;
        double endValue = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter desired end value for the loop: ");
        endValue = keyboard.nextDouble();

        while (x <= endValue - 1) {
            System.out.println("<p>" + x + "</p>");
            x++;

            System.out.println(storedNum);

            if ((Integer.valueOf(x) % 3 == 0) && (Integer.valueOf(x) % 5 == 0)) {
                storedNum += "FizzBuzz" + "<br/>";
            } else if (Integer.valueOf(x) % 3 == 0) {
                storedNum += "Fizz" + "<br/>";
            } else if (Integer.valueOf(x) % 5 == 0) {
                storedNum += "Buzz" + "<br/>";
            } else if ((Integer.valueOf(x) % 3 != 0) && (Integer.valueOf(x) % 5 != 0)) {
                storedNum += x + "<br/>";
            }


        }
        System.out.println();
        return storedNum + "<br>" + "End Value for Multiples Search: " + endValue + "<br>" + "Multiples of 7: " + String.valueOf(counter7) + "<br>" + "Multiples of 17: " + String.valueOf(counter17) + "<br>" + "Multiples of 23: " + String.valueOf(counter23); 

    }


    //Bonus Code
    @RequestMapping("/bonus")
    public String Bonus ()

    {

        int x = 0;
        String storedNum = "";
        String multiples7 = "";
        String multiples17 = "";
        String multiples23 = "";
        int counter7 = 0;
        int counter17 = 0;
        int counter23 = 0;
        double endValue = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter desired end value for the loop: ");
        endValue = keyboard.nextDouble();

        while (x <= endValue - 1) {
            x++;



            if (Integer.valueOf(x) % 7 == 0) {
                multiples7 += x + "<br/>";
                counter7++;
            } else if (Integer.valueOf(x) % 17 == 0) {
                multiples17 += x + "<br/>";
                counter17++;
            } else if (Integer.valueOf(x) % 23 == 0) {
                multiples23 += x + "<br/>";
                counter23++;
            } else {
                storedNum += x + "<br/>";
            }


        }

        return storedNum + "<br>" + "End Value for Multiples Search: " + endValue + "<br>" + "Multiples of 7: " + String.valueOf(counter7) + "<br>" + "Multiples of 17: " + String.valueOf(counter17) + "<br>" + "Multiples of 23: " + String.valueOf(counter23);


    }
}