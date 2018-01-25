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

        do {
            System.out.println("<p>" + x + "</p>" );
            x++;
            System.out.println("\\n");

        }
        while (x <= 100);
        {
        int printFizzBuzz = x++;
        System.out.println();
        return returnValue(printFizzBuzz);
        }

    }
}