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

        do {
            //System.out.println("<p>" + x + "</p>" );
            x++;
            storedNum = String.valueOf((x));
            System.out.println(storedNum);

        }
        while (x <= 100);

        System.out.println();
        return  String.valueOf((x+1));


    }
}