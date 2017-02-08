package com.expedia.www;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<History> report;

    	System.out.println("Welcome to the Expedia challenge");

        System.out.println("Please choose:");
        System.out.println("1. Edit Website");
        System.out.println("2. Edit Report");
        System.out.println("3. Exit");

        int userInput = scanner.nextInt();

        switch (userInput){
            case 1:
                editWebsite();
                break;
            case 2:
                editReport();
                break;
            case 3:
                return;
        }


    }
    static void editWebsite(){
        EditWebPage editting = new EditWebPage();
        editting.editElement();
    }

    static void editReport(){

    }
}