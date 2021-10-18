package com.company.Interface;

import java.util.Scanner;

public class Interface {


    public String uncheckedInput(String prompt)
    {
        String userInput = "";
        Scanner inputScanner = new Scanner(System.in);

        System.out.print(prompt);
        userInput = inputScanner.nextLine();
        return userInput;
    }







}
