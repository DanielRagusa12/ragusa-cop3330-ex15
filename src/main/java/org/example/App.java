package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String username;
        String password;
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        username = input.next();

        System.out.print("What is the password? ");
        password = input.next();

        if(password.equals("abc$123")==true)
        {
            System.out.print("Welcome!");
        }

        else if(password.equals("abc$123")==false)
        {
            System.out.print("I don't know you.");
        }

    }

}