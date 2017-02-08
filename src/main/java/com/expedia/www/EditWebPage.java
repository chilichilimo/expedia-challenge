package com.expedia.www;


import java.util.Scanner;

/*
 Ask user for the URL that they wish to edit
Display the current <title>, <meta name="description" content="" /> and <meta name="keywords" content"" /> to the user
Ask which element they would like to edit
Ask what the user wants the new content for that element to be
Save the old value and new value (in memory is fine)
Ask the user if they wish to continue editing, if yes, return to step 2, else return to the options menu
* */
public class EditWebPage {
    History h;

    public EditWebPage() {
        String url = askForURL();
        String[] oldValues = {"old title", "old meta desc", "old meta keyword"};
        h = new History(url, oldValues);
    }

    protected String askForURL() {
        return askForUserInput("Enter the URL you would like to edit: ");
    }

    protected void editElement() {
        String element = askForUserInput( "Which element would you like to edit?");
        if (element.equals("title")) {
            h.setTitle(askForNewContent());
        } else if (element.equals("meta description")) {
            h.setMetaDesc(askForNewContent());
        } else {
            h.setKeyword(askForNewContent());
        }
    }

    protected String askForNewContent() {
        return askForUserInput("Enter the new content you would like to replace it with: ");
    }

    protected boolean askIfContinue() {
        return (askForUserInput("Continue editing? [Y/N]") == "Y");
    }



    private static String askForUserInput(String msg) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println(msg);
        return reader.nextLine();
    }



}
