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

        while (x <= 99) {
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
        return storedNum;


    }
}