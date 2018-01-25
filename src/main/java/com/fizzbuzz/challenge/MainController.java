package com.fizzbuzz.challenge;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping ("/")
    public String fizzbuzz() {

        int cusNumber = 12345;
        String cusName = "Jane Doe";
        double salesAmount = 30.56;

        double taxCode = 0;
        String taxCode0 = "tax exempt";

        double taxCode1 = .03;
        double taxCode2 = .05;
        double salesTotal = (salesAmount * taxCode) + salesAmount;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter in tax code:");
        taxCode = keyboard.nextDouble();

        if (taxCode == 0) {
            System.out.println(taxCode0);
        }
        else if (taxCode == 1) {
            salesTotal = (salesAmount * taxCode1) + salesAmount;
        }
        else if (taxCode == 2) {
            salesTotal = (salesAmount * taxCode2) + salesAmount;
        }



        String displayReport = "<b>"+ "Sales Report" +"</b>" + "<p>" + "<b>"+ "Customer Number: " + "</b>" + cusNumber + "<p>" + "<b>"+ "Customer Name: "+ "</b>" + cusName + "<p>" + "<b>"+ "Sales Amount: " + "</b>" + salesAmount + "<p>" + "<b>"+ "Sales Total: "+ "</b>" +salesTotal;

        System.out.println();
        return displayReport;